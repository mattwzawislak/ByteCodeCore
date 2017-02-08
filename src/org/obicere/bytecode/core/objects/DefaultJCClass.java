package org.obicere.bytecode.core.objects;

import org.javacore.JCClass;
import org.javacore.JCField;
import org.javacore.JCMethod;
import org.javacore.annotation.Annotation;
import org.javacore.type.Type;
import org.javacore.type.generic.GenericDeclarationDeclarer;
import org.obicere.bytecode.core.objects.attribute.AttributeSet;
import org.obicere.bytecode.core.objects.attribute.InnerClassesAttribute;
import org.obicere.bytecode.core.objects.attribute.SignatureAttribute;
import org.obicere.bytecode.core.objects.common.BootstrapMethod;
import org.obicere.bytecode.core.objects.common.InnerClass;
import org.obicere.bytecode.core.objects.common.Version;
import org.obicere.bytecode.core.objects.constant.DefaultConstantClass;
import org.obicere.bytecode.core.objects.constant.ConstantPool;
import org.obicere.bytecode.core.objects.type.AccessibleTypeFactory;
import org.obicere.bytecode.core.objects.type.DefaultGenericType;
import org.obicere.bytecode.core.objects.type.DefaultTypedClass;
import org.javacore.type.factory.TypeFactory;
import org.obicere.bytecode.core.objects.type.generic.ClassGenericDeclaration;
import org.obicere.bytecode.core.objects.type.parser.SignatureParser;
import org.obicere.bytecode.core.objects.type.signature.DefaultClassSignature;
import org.obicere.bytecode.core.reader.FieldReader;
import org.obicere.bytecode.core.reader.MethodReader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class DefaultJCClass implements JCClass, GenericDeclarationDeclarer<ClassGenericDeclaration> {

    private static final int MAGIC_NUMBER = 0xCAFEBABE;

    private int minorVersion;

    private int majorVersion;

    private String packageName;

    private String simpleName;

    private int accessFlags;

    // this is only needed for access flags, as this is a very simple bit
    // of information that can be set initially, yet updated with
    private boolean innerClassAccessFlagsInitialized;

    private ClassGenericDeclaration declaration;

    private boolean classGenericDeclarationInitialized;

    private DefaultJCClass superClass;

    private DefaultTypedClass genericSuperClass;

    private JCClass[] superInterfaces;

    private DefaultTypedClass[] genericSuperInterfaces;

    private DefaultGenericType[] genericTypes;

    private JCClass enclosingClass;

    private JCClass[] innerClasses;

    private JCMethod[] methods;

    private JCField[] fields;

    private JCMethod enclosingMethod;

    private BootstrapMethod[] bootstrapMethods;

    // Lazy flag specifying whether all the relevant information has been
    // extracted from the constant pool and attribute set structures.
    // If so, they can be disposed completely.
    private boolean fullyInitialized;

    // disposable fields should be up here
    // all important information needs to be in an information structure
    // this is to avoid duplication of materials and illegal states
    private ConstantPool constantPool;

    private AttributeSet attributeSet;

    private String superName;

    private String[] interfaces;

    public DefaultJCClass() {

    }

    public DefaultJCClass(final ByteCodeReader input) throws IOException {
        input.enterNode(this);

        final int magic = input.readInt();
        if (magic != MAGIC_NUMBER) {
            throw new ClassFormatError("invalid magic number constant: " + magic);
        }

        final int minorVersion = input.readUnsignedShort();
        final int majorVersion = input.readUnsignedShort();

        final ConstantPool constantPool = new ConstantPool(input);

        final int accessFlags = input.readUnsignedShort();
        final DefaultConstantClass constantName = input.readConstant();
        final DefaultConstantClass constantSuperName = input.readConstant();
        final String thisName = constantName.getName();

        final String superName;
        // superName may be null
        if (constantSuperName == null) {
            // for java.lang.Object only
            if (!thisName.equals("java/lang/Object")) {
                throw new NullPointerException("super class must be non-null");
            }
            superName = null;
        } else {
            superName = constantSuperName.getName();
        }

        // read all the interfaces
        final int interfacesCount = input.readUnsignedShort();
        final String[] interfaces = new String[interfacesCount];
        for (int i = 0; i < interfacesCount; i++) {
            final DefaultConstantClass constantInterfaceName = input.readConstant();
            interfaces[i] = constantInterfaceName.getName();
        }

        // read all the fields
        final FieldReader fieldReader = new FieldReader();

        final int fieldsCount = input.readUnsignedShort();
        final DefaultJCField[] fields = new DefaultJCField[fieldsCount];
        for (int i = 0; i < fieldsCount; i++) {
            fields[i] = fieldReader.read(input);
        }

        // read all the methods
        final MethodReader methodReader = new MethodReader();

        final int methodsCount = input.readUnsignedShort();
        final DefaultJCMethod[] methods = new DefaultJCMethod[methodsCount];
        for (int i = 0; i < methodsCount; i++) {
            methods[i] = methodReader.read(input);
        }

        final AttributeSet attributeSet = input.readAttributeSet();

        this.minorVersion = minorVersion;
        this.majorVersion = majorVersion;
        this.accessFlags = accessFlags;
        // need to set the name independently
        this.superName = superName;
        this.interfaces = interfaces;
        this.fields = fields;
        this.methods = methods;

        this.constantPool = constantPool;
        this.attributeSet = attributeSet;
        this.superName = superName;
        this.interfaces = interfaces;

        input.pollConstants();
        input.exitNode(this);
    }

    public DefaultJCClass(final int minorVersion, final int majorVersion, final ConstantPool constantPool, final int accessFlags, final String name, final String superName, final String[] interfaces, final DefaultJCField[] fields, final DefaultJCMethod[] methods, final AttributeSet attributeSet) {
        // set all the simple information here
        this.minorVersion = minorVersion;
        this.majorVersion = majorVersion;
        this.accessFlags = accessFlags;
        // need to set the name independently
        this.superName = superName;
        this.interfaces = interfaces;
        this.fields = fields;
        this.methods = methods;

        this.constantPool = constantPool;
        this.attributeSet = attributeSet;
        this.superName = superName;
        this.interfaces = interfaces;
    }

    public int getMinorVersion() {
        return minorVersion;
    }

    public void setMinorVersion(final int minorVersion) {
        this.minorVersion = minorVersion;
    }

    public int getMajorVersion() {
        return majorVersion;
    }

    public void setMajorVersion(final int majorVersion) {
        this.majorVersion = majorVersion;
    }

    public void setVersion(final Version version) {
        final Version specific;
        if (version == null) {
            specific = Version.getDefault();
        } else {
            specific = version;
        }
        this.majorVersion = specific.getMajor();
        this.minorVersion = specific.getMinor();
    }

    public int getAccessFlags() {
        if (!innerClassAccessFlagsInitialized) {
            initializeInnerClassAccessFlags();
        }
        return accessFlags;
    }

    private void initializeInnerClassAccessFlags() {
        final AttributeSet attributeSet = this.attributeSet;
        if (attributeSet != null) {
            // should we have an accessor for this?
            // it would be needed for getting the inner classes, enclosing
            // class and access flags. After all of those are initialized
            // it can be removed and therefore a single access point would
            // control exactly when and where we can remove it
            //
            // maybe
            // private InnerClass[] innerClassInfo;
            // private InnerClass thisInnerClassInfo;
            final InnerClassesAttribute attribute = attributeSet.getAttribute(InnerClassesAttribute.class);
            final InnerClass[] innerClasses = attribute.getInnerClasses();
            for (final InnerClass innerClass : innerClasses) {
                if (innerClass != null) {
                    final String outerInfo = innerClass.getOuterClassInfo();
                    final String innerInfo = innerClass.getInnerClassInfo();
                    final String innerName = innerClass.getInnerName();
                    final int accessFlags = innerClass.getInnerClassAccessFlags();

                    System.out.printf("Printing Inner Class information: [outerInfo=%s, innerInfo=%s, innerName=%s, accessFlags=%x]%n", outerInfo, innerInfo, innerName, accessFlags);
                    /*
                    if (innerName.equals(simpleName) && blah blah blah fuck this shit) {
                        this.accessFlags = accessFlags;
                    }
                     */
                }
            }
        }
        innerClassAccessFlagsInitialized = true;
    }

    public void setAccessFlags(final int accessFlags) {
        this.accessFlags = accessFlags;
    }

    @Override
    public int getFieldsCount() {
        return 0;
    }

    @Override
    public JCField[] getFields() {
        return fields;
    }

    public void setFields(final JCField[] fields) {
        this.fields = fields;
    }

    @Override
    public int getMethodsCount() {
        return 0;
    }

    public JCMethod[] getMethods() {
        return methods;
    }

    public void setMethods(final JCMethod[] methods) {
        this.methods = methods;
    }

    @Override
    public Annotation[] getAnnotations() {
        return new Annotation[0];
    }

    @Override
    public String getName() {
        return null;
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
    public final boolean isPrimitive() {
        return false;
    }

    @Override
    public final boolean isGeneric() {
        return false;
    }

    @Override
    public final boolean isArray() {
        return false;
    }

    public JCClass getSuperClass() {
        if (superClass == null && superName != null) {
            superClass = (DefaultJCClass) Type.of(superName);
        }
        return superClass;
    }

    @Override
    public int getSuperInterfaceCount() {
        return 0;
    }

    @Override
    public JCClass[] getSuperInterfaces() {
        if (superInterfaces == null && interfaces != null) {
            final int length = interfaces.length;
            final DefaultJCClass[] superInterfaces = new DefaultJCClass[length];
            for (int i = 0; i < length; i++) {
                if (interfaces[i] != null) {
                    superInterfaces[i] = (DefaultJCClass) Type.of(interfaces[i]);
                }
            }
            this.superInterfaces = superInterfaces;
        }
        return superInterfaces;
    }

    public DefaultTypedClass getGenericSuperClass() {
        if (genericSuperClass == null) {
            final ClassGenericDeclaration declaration = getDeclaration();
            if (declaration != null) {
                this.genericSuperClass = declaration.getSuperClass();
            }
        }
        return genericSuperClass;
    }

    public DefaultTypedClass[] getGenericSuperInterfaces() {
        if (genericSuperInterfaces == null) {
            final ClassGenericDeclaration declaration = getDeclaration();
            if (declaration != null) {
                this.genericSuperInterfaces = declaration.getSuperInterfaces();
            }
        }
        return genericSuperInterfaces;
    }

    public JCClass[] getInnerClasses() {
        return null;
    }

    public JCClass getOuterClass() {
        return null;
    }

    public DefaultGenericType[] getGenericTypes() {
        return null;
    }

    @Override
    public ClassGenericDeclaration getDeclaration() {
        if (!classGenericDeclarationInitialized) {
            initializeGenericDeclaration();
        }
        return declaration;
    }

    private void initializeGenericDeclaration() {
        final SignatureAttribute attribute = attributeSet.getAttribute(SignatureAttribute.class);
        if (attribute != null) {
            final String signatureText = attribute.getSignature();
            final DefaultClassSignature signature = new SignatureParser(signatureText).parseClassSignature();

            final TypeFactory factory = new AccessibleTypeFactory(this);

            declaration = new ClassGenericDeclaration(this, signature, factory);
        }

        classGenericDeclarationInitialized = true;
    }
}
