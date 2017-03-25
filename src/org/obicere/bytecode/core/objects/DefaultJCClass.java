package org.obicere.bytecode.core.objects;

import org.javacore.Identifier;
import org.javacore.JCClass;
import org.javacore.JCField;
import org.javacore.JCMethod;
import org.javacore.annotation.Annotation;
import org.javacore.attribute.Attribute;
import org.javacore.attribute.UnknownAttribute;
import org.javacore.common.BootstrapMethod;
import org.javacore.constant.ConstantClass;
import org.javacore.constant.ConstantPool;
import org.javacore.type.GenericType;
import org.javacore.type.TypedClass;
import org.javacore.type.generic.ClassGenericDeclaration;
import org.obicere.bytecode.core.objects.attribute.AttributeSet;
import org.obicere.bytecode.core.objects.common.Version;
import org.obicere.bytecode.core.objects.constant.DefaultConstantPool;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class DefaultJCClass implements JCClass {

    private static final int MAGIC_NUMBER = 0xCAFEBABE;

    private int minorVersion;

    private int majorVersion;

    // dependencies: InnerClasses
    private int accessFlags;

    private String name;

    // retention: disposable
    private String superName;

    // retention: disposable
    private String[] interfaces;

    private JCMethod[] methods;

    private JCField[] fields;

    // retention: disposable
    private AttributeSet attributeSet;

    // special information

    // dependencies: SourceFileAttribute
    private String sourceFile;

    // dependencies: SourceDebugExtension
    private String sourceDebugExtension;

    // dependencies: superName, Signature, RuntimeVisibleTypeAnnotations, RuntimeInvisibleTypeAnnotations
    private TypedClass genericSuperClass;

    // dependencies: interfaces, Signature, RuntimeVisibleTypeAnnotations, RuntimeInvisibleTypeAnnotations
    private TypedClass[] genericSuperInterfaces;

    // dependencies: Signature, RuntimeVisibleTypeAnnotations, RuntimeInvisibleTypeAnnotations
    private GenericType[] genericTypes;

    // dependencies: InnerClasses, EnclosingMethod
    private JCClass outerClass;

    // dependencies: InnerClasses
    private JCClass enclosingClass;

    // dependencies: InnerClasses
    private JCClass[] innerClasses;

    // dependencies EnclosingMethod
    private JCMethod enclosingMethod;

    // dependencies: BootstrapMethods
    private BootstrapMethod[] bootstrapMethods;

    // dependencies: Synthetic
    private boolean synthetic;

    // dependencies: Deprecated
    private boolean deprecated;

    // dependencies: RuntimeVisibleAnnotations, RuntimeInvisibleAnnotations
    private Annotation[] annotations;

    private ClassGenericDeclaration declaration;

    private UnknownAttribute[] unknownAttributes;

    public DefaultJCClass() {

    }

    public DefaultJCClass(final ByteCodeReader input) throws IOException {
        input.enterParent(this);

        final int magic = input.readInt();
        if (magic != MAGIC_NUMBER) {
            throw new ClassFormatError("invalid magic number constant: " + magic);
        }

        final int minorVersion = input.readUnsignedShort();
        final int majorVersion = input.readUnsignedShort();

        final ConstantPool constantPool = new DefaultConstantPool(input);

        final int accessFlags = input.readUnsignedShort();
        final ConstantClass constantName = input.readConstant();
        final ConstantClass constantSuperName = input.readConstant();
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
            final ConstantClass constantInterfaceName = input.readConstant();
            interfaces[i] = constantInterfaceName.getName();
        }

        // read all the fields
        final int fieldsCount = input.readUnsignedShort();
        final JCField[] fields = new JCField[fieldsCount];
        for (int i = 0; i < fieldsCount; i++) {
            fields[i] = input.read(Identifier.FIELD);
        }

        // read all the methods
        final int methodsCount = input.readUnsignedShort();
        final JCMethod[] methods = new JCMethod[methodsCount];
        for (int i = 0; i < methodsCount; i++) {
            methods[i] = input.read(Identifier.METHOD);
        }

        final AttributeSet attributeSet = input.readAttributeSet();

        this.minorVersion = minorVersion;
        this.majorVersion = majorVersion;
        this.accessFlags = accessFlags;
        this.name = thisName;
        this.superName = superName;
        this.interfaces = interfaces;
        this.fields = fields;
        this.methods = methods;
        this.attributeSet = attributeSet;

        input.pollConstants(constantPool);
        input.exitParent(this);
    }

    @Override
    public int getMinorVersion() {
        return minorVersion;
    }

    @Override
    public void setMinorVersion(final int minorVersion) {
        this.minorVersion = minorVersion;
    }

    @Override
    public int getMajorVersion() {
        return majorVersion;
    }

    @Override
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

    @Override
    public int getAccessFlags() {
        initializeInnerClasses();
        return accessFlags;
    }

    @Override
    public void setAccessFlags(final int accessFlags) {
        initializeInnerClasses();
        this.accessFlags = accessFlags;
    }

    @Override
    public String getPackage() {
        return null;
    }

    @Override
    public String getName() {
        return name;
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

    @Override
    public int getFieldsCount() {
        return fields.length;
    }

    @Override
    public JCField[] getFields() {
        return fields.clone();
    }

    @Override
    public void setFields(final JCField[] fields) {
        if (fields == null) {
            this.fields = new JCField[0];
            return;
        }
        this.fields = fields.clone();
    }

    @Override
    public int getMethodsCount() {
        return methods.length;
    }

    @Override
    public JCMethod[] getMethods() {
        return methods.clone();
    }

    @Override
    public void setMethods(final JCMethod[] methods) {
        if (methods == null) {
            this.methods = new JCMethod[0];
            return;
        }
        this.methods = methods.clone();
    }

    @Override
    public String getSourceFile() {
        initializeSourceFile();
        return sourceFile;
    }

    @Override
    public void setSourceFile(final String sourceFile) {
        initializeSourceFile();
        this.sourceFile = sourceFile;
    }

    @Override
    public String getSourceDebugExtension() {
        initializeSourceDebugExtension();
        return sourceDebugExtension;
    }

    @Override
    public void setSourceDebugExtension(final String sourceDebugExtension) {
        initializeSourceDebugExtension();
        this.sourceDebugExtension = sourceDebugExtension;
    }

    @Override
    public JCClass getSuperClass() {
        initializeSignature();
        initializeTypeAnnotations();
        return genericSuperClass.getRawType();
    }

    @Override
    public TypedClass getGenericSuperClass() {
        initializeSignature();
        initializeTypeAnnotations();
        return genericSuperClass;
    }

    @Override
    public void setSuperClass(final JCClass superClass) {
        initializeSignature();
        initializeTypeAnnotations();
        genericSuperClass.setRawType(superClass);
    }

    @Override
    public void setGenericSuperClass(final TypedClass genericSuperClass) {
        initializeSignature();
        initializeTypeAnnotations();
        this.genericSuperClass = genericSuperClass;
    }

    @Override
    public int getSuperInterfaceCount() {
        initializeSignature();
        initializeTypeAnnotations();
        return genericSuperInterfaces.length;
    }

    @Override
    public JCClass[] getSuperInterfaces() {
        initializeSignature();
        initializeTypeAnnotations();
        final int length = genericSuperInterfaces.length;
        final JCClass[] clone = new JCClass[length];
        for (int i = 0; i < length; i++) {
            clone[i] = genericSuperInterfaces[i].getRawType();
        }
        return clone;
    }

    @Override
    public void setSuperInterfaces(final JCClass[] superInterfaces) {
        initializeSignature();
        initializeTypeAnnotations();
        if (superInterfaces == null) {
            this.genericSuperInterfaces = new TypedClass[0];
            return;
        }
        for (int i = 0; i < genericSuperInterfaces.length; i++) {
            genericSuperInterfaces[i].setRawType(superInterfaces[i]);
        }
    }

    @Override
    public TypedClass[] getGenericSuperInterfaces() {
        initializeSignature();
        initializeTypeAnnotations();
        return genericSuperInterfaces.clone();
    }

    @Override
    public void setGenericSuperInterfaces(final TypedClass[] genericSuperInterfaces) {
        initializeSignature();
        initializeTypeAnnotations();
        if (genericSuperInterfaces == null) {
            this.genericSuperInterfaces = new TypedClass[0];
            return;
        }
        this.genericSuperInterfaces = genericSuperInterfaces.clone();
    }

    @Override
    public GenericType[] getGenericTypes() {
        initializeSignature();
        initializeTypeAnnotations();
        return genericTypes.clone();
    }

    @Override
    public void setGenericTypes(final GenericType[] genericTypes) {
        initializeSignature();
        initializeTypeAnnotations();
        this.genericTypes = genericTypes.clone();
    }

    @Override
    public JCClass getOuterClass() {
        initializeInnerClasses();
        return outerClass;
    }

    @Override
    public void setOuterClass(final JCClass outerClass) {
        initializeInnerClasses();
        this.outerClass = outerClass;
    }

    @Override
    public JCClass getEnclosingClass() {
        initializeInnerClasses();
        initializeEnclosingMethod();
        return outerClass;
    }

    @Override
    public JCClass[] getInnerClasses() {
        initializeInnerClasses();
        return innerClasses.clone();
    }

    @Override
    public void setInnerClasses(final JCClass[] innerClasses) {
        initializeInnerClasses();
        if (innerClasses == null) {
            this.innerClasses = new JCClass[0];
            return;
        }
        this.innerClasses = innerClasses.clone();
    }

    @Override
    public JCMethod getEnclosingMethod() {
        initializeEnclosingMethod();
        return enclosingMethod;
    }

    @Override
    public void setEnclosingMethod(final JCMethod enclosingMethod) {
        initializeEnclosingMethod();
        this.enclosingMethod = enclosingMethod;
    }

    @Override
    public BootstrapMethod[] getBootstrapMethods() {
        initializeBootstrapMethods();
        return bootstrapMethods.clone();
    }

    @Override
    public void setBootstrapMethods(final BootstrapMethod[] bootstrapMethods) {
        initializeBootstrapMethods();
        if (bootstrapMethods == null) {
            this.bootstrapMethods = new BootstrapMethod[0];
            return;
        }
        this.bootstrapMethods = bootstrapMethods;
    }

    @Override
    public boolean isSynthetic() {
        initializeSynthetic();
        return synthetic;
    }

    @Override
    public void setSynthetic(final boolean synthetic) {
        initializeSynthetic();
        this.synthetic = synthetic;
    }

    @Override
    public boolean isDeprecated() {
        initializeDeprecated();
        return deprecated;
    }

    @Override
    public void setDeprecated(final boolean deprecated) {
        initializeDeprecated();
        this.deprecated = deprecated;
    }

    @Override
    public Annotation[] getAnnotations() {
        initializeAnnotations();
        return annotations.clone();
    }

    @Override
    public void setAnnotations(final Annotation[] annotations) {
        initializeAnnotations();
        if (annotations == null) {
            this.annotations = new Annotation[0];
            return;
        }
        this.annotations = annotations.clone();
    }

    @Override
    public ClassGenericDeclaration getDeclaration() {
        initializeSignature();
        initializeTypeAnnotations();
        return declaration;
    }

    @Override
    public Attribute[] getAttributes() {
        throw new UnsupportedOperationException("oh helllllllll naw fam. This shit is so halal");
    }

    @Override
    public UnknownAttribute[] getUnknownAttributes() {
        initializeUnknownAttributes();
        return unknownAttributes;
    }

    @Override
    public void setUnknownAttributes(final UnknownAttribute[] unknownAttributes) {
        initializeUnknownAttributes();
        this.unknownAttributes = unknownAttributes;
    }

    private boolean sourceFileInitialized = false;

    private boolean innerClassesInitialized = false;

    private boolean enclosingMethodInitialized = false;

    private boolean sourceDebugExtensionInitialized = false;

    private boolean bootstrapMethodsInitialized = false;

    private boolean syntheticInitialized = false;

    private boolean deprecatedInitialized = false;

    private boolean signatureInitialized = false;

    private boolean annotationsInitialized = false;

    private boolean typeAnnotationsInitialized = false;

    private boolean unknownAttributesInitialized = false;

    private void initializeSourceFile() {
        if (sourceFileInitialized) {
            return;
        }

        sourceFileInitialized = true;
    }

    private void initializeInnerClasses() {
        if (innerClassesInitialized) {
            return;
        }

        innerClassesInitialized = true;
    }

    private void initializeEnclosingMethod() {
        if (enclosingMethodInitialized) {
            return;
        }

        enclosingMethodInitialized = true;
    }

    private void initializeSourceDebugExtension() {
        if (sourceDebugExtensionInitialized) {
            return;
        }

        sourceDebugExtensionInitialized = true;
    }

    private void initializeBootstrapMethods() {
        if (bootstrapMethodsInitialized) {
            return;
        }

        bootstrapMethodsInitialized = true;
    }

    private void initializeSynthetic() {
        if (syntheticInitialized) {
            return;
        }

        syntheticInitialized = true;
    }

    private void initializeDeprecated() {
        if (deprecatedInitialized) {
            return;
        }

        deprecatedInitialized = true;
    }

    private void initializeSignature() {
        if (signatureInitialized) {
            return;
        }

        signatureInitialized = true;
    }

    private void initializeAnnotations() {
        if (annotationsInitialized) {
            return;
        }

        annotationsInitialized = true;
    }

    private void initializeTypeAnnotations() {
        if (typeAnnotationsInitialized) {
            return;
        }

        typeAnnotationsInitialized = true;
    }

    private void initializeUnknownAttributes() {
        if (unknownAttributesInitialized) {
            return;
        }

        unknownAttributesInitialized = true;
    }
}
