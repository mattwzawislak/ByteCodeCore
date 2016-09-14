package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.Identifiable;
import org.obicere.bytecode.core.objects.attribute.Attribute;
import org.obicere.bytecode.core.objects.attribute.AttributeSet;
import org.obicere.bytecode.core.objects.attribute.InnerClassesAttribute;
import org.obicere.bytecode.core.objects.attribute.SignatureAttribute;
import org.obicere.bytecode.core.objects.common.InnerClass;
import org.obicere.bytecode.core.objects.constant.ConstantPool;
import org.obicere.bytecode.core.type.AccessibleTypeFactory;
import org.obicere.bytecode.core.type.ClassType;
import org.obicere.bytecode.core.type.GenericType;
import org.obicere.bytecode.core.type.ReferenceType;
import org.obicere.bytecode.core.type.Type;
import org.obicere.bytecode.core.type.TypeLoader;
import org.obicere.bytecode.core.type.generic.ClassGenericDeclaration;
import org.obicere.bytecode.core.type.parser.SignatureParser;
import org.obicere.bytecode.core.type.signature.ClassSignature;

import java.util.LinkedList;

/**
 * @author Obicere
 */
public final class Class implements ClassType, Identifiable {

    public static final String IDENTIFIER = "ClassFile";

    private final int minorVersion;

    private final int majorVersion;

    private final ConstantPool constantPool;

    private final int accessFlags;

    private final int thisClass;

    private final int superClass;

    private final int[] interfaces;

    private final Field[] fields;

    private final Method[] methods;

    private final AttributeSet attributeSet;

    public Class(final int minorVersion, final int majorVersion, final ConstantPool constantPool, final int accessFlags, final int thisClass, final int superClass, final int[] interfaces, final Field[] fields, final Method[] methods, final Attribute[] attributes) {
        if (constantPool == null) {
            throw new NullPointerException("constant pool must be non-null");
        }
        if (fields == null) {
            throw new NullPointerException("fields must be non-null");
        }
        if (methods == null) {
            throw new NullPointerException("methods must be non-null");
        }
        if (attributes == null) {
            throw new NullPointerException("attributes must be non-null");
        }

        this.minorVersion = minorVersion;
        this.majorVersion = majorVersion;
        this.constantPool = constantPool;
        this.accessFlags = accessFlags;
        this.thisClass = thisClass;
        this.superClass = superClass;
        this.interfaces = interfaces;
        this.fields = fields;
        this.methods = methods;
        this.attributeSet = new AttributeSet(attributes);
    }

    public int getMinorVersion() {
        return minorVersion;
    }

    public int getMajorVersion() {
        return majorVersion;
    }

    public ConstantPool getConstantPool() {
        return constantPool;
    }

    public int getAccessFlags() {
        return accessFlags;
    }

    public String getSuperName() {
        return constantPool.getAsString(superClass);
    }

    public String getName() {
        return constantPool.getAsString(thisClass);
    }

    @Override
    public String getSimpleName() {
        return null;
    }

    @Override
    public String getCanonicalName() {
        return null;
    }

    @Override
    public boolean isPrimitive() {
        return false;
    }

    @Override
    public boolean isGeneric() {
        return false;
    }

    @Override
    public boolean isArray() {
        return false;
    }

    @Override
    public Field[] getFields() {
        return fields;
    }

    private volatile ClassType loadedSuperClass;

    private volatile ClassType[] loadedSuperInterfaces;

    @Override
    public ReferenceType getSuperClass() {
        final ClassGenericDeclaration declaration = getDeclaration();
        if (declaration == null) {
            if (loadedSuperClass == null) {
                final String name = constantPool.getAsString(superClass);
                loadedSuperClass = (ClassType) TypeLoader.getSystemLoader().getType(name);
            }
            return loadedSuperClass;
        } else {
            return declaration.getSuperClass();
        }
    }

    @Override
    public ReferenceType[] getSuperInterfaces() {
        final ClassGenericDeclaration declaration = getDeclaration();
        if (declaration == null) {
            if (loadedSuperInterfaces == null) {
                loadedSuperInterfaces = new ClassType[interfaces.length];
                for (int i = 0; i < interfaces.length; i++) {
                    final String name = constantPool.getAsString(interfaces[i]);
                    loadedSuperInterfaces[i] = (ClassType) TypeLoader.getSystemLoader().getType(name);
                }
            }
            return loadedSuperInterfaces;
        } else {
            return declaration.getSuperInterfaces();
        }
    }

    private volatile ClassType[] innerClasses;

    @Override
    public ReferenceType[] getInnerClasses() {
        if (innerClasses == null) {
            final InnerClassesAttribute attribute = attributeSet.getAttribute(InnerClassesAttribute.class);
            final InnerClass[] classes = attribute.getInnerClasses();

            final LinkedList<ClassType> classTypes = new LinkedList<>();
            for(final InnerClass cls : classes) {
                final String outerInfo = constantPool.getAsString(cls.getOuterClassInfoIndex());
                if(outerInfo.equals(getName())) {
                    final String innerClassName = constantPool.getAsString(cls.getInnerClassInfoIndex());

                    classTypes.add((ClassType) Type.of(innerClassName));
                }
            }
            innerClasses = classTypes.toArray(new ClassType[classTypes.size()]);
        }

        return innerClasses;
    }

    private volatile ClassType outerClass;

    @Override
    public ReferenceType getOuterClass() {
        if (outerClass == null) {
            final InnerClassesAttribute attribute = attributeSet.getAttribute(InnerClassesAttribute.class);
            final InnerClass[] classes = attribute.getInnerClasses();
            for(final InnerClass cls : classes) {
                final String innerInfo = constantPool.getAsString(cls.getInnerClassInfoIndex());
                if(innerInfo.equals(getName())) {
                    final String outerClassName = constantPool.getAsString(cls.getOuterClassInfoIndex());

                    this.outerClass = (ClassType) Type.of(outerClassName);
                    break;
                }
            }
        }
        return outerClass;
    }

    @Override
    public GenericType[] getGenericTypes() {
        final ClassGenericDeclaration declaration = getDeclaration();
        if (declaration == null) {
            return new GenericType[0];
        } else {
            return declaration.getGenericTypes();
        }
    }

    @Override
    public Method[] getMethods() {
        return methods;
    }

    // TODO remove
    public AttributeSet getAttributeSet() {
        return attributeSet;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }

    private volatile ClassGenericDeclaration declaration;

    @Override
    public ClassGenericDeclaration getDeclaration() {
        if (declaration == null) {

            final SignatureAttribute attribute = getAttributeSet().getAttribute(SignatureAttribute.class);
            if (attribute == null) {
                return null;
            }
            final String signature = getConstantPool().getAsString(attribute.getSignatureIndex());

            final AccessibleTypeFactory factory = new AccessibleTypeFactory(this);

            final SignatureParser parser = new SignatureParser(signature);

            final ClassSignature parsedSignature = parser.parseClassSignature();


            this.declaration = new ClassGenericDeclaration(this, parsedSignature, factory);
        }
        return declaration;
    }

}
