package org.obicere.bytecode.core.objects;

import org.javacore.JCClass;
import org.javacore.JCField;
import org.javacore.JCMethod;
import org.javacore.JavaCore;
import org.javacore.annotation.Annotation;
import org.javacore.attribute.Attribute;
import org.javacore.attribute.AttributeSet;
import org.javacore.attribute.DeprecatedAttribute;
import org.javacore.attribute.InnerClassesAttribute;
import org.javacore.attribute.RuntimeInvisibleAnnotationsAttribute;
import org.javacore.attribute.RuntimeVisibleAnnotationsAttribute;
import org.javacore.attribute.SignatureAttribute;
import org.javacore.attribute.SourceDebugExtensionAttribute;
import org.javacore.attribute.SourceFileAttribute;
import org.javacore.attribute.SyntheticAttribute;
import org.javacore.attribute.UnknownAttribute;
import org.javacore.common.BootstrapMethod;
import org.javacore.common.InnerClass;
import org.javacore.type.GenericType;
import org.javacore.type.TypedClass;
import org.javacore.type.factory.TypeFactory;
import org.javacore.type.generic.ClassGenericDeclaration;
import org.javacore.type.signature.ClassSignature;
import org.obicere.bytecode.core.objects.common.Version;
import org.obicere.bytecode.core.objects.type.factory.DefaultTypeFactory;
import org.obicere.bytecode.core.objects.type.generic.DefaultClassGenericDeclaration;
import org.obicere.bytecode.core.objects.type.parser.SignatureParser;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @author Obicere
 */
public class DefaultJCClass implements JCClass {

    private static final int OUTER_ACCESS_FLAGS_MASK = 0x7631;

    private static final int NON_OUTER_ACCESS_FLAGS_MASK = 0x761f;

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
    private AttributeSet attributes;

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

    private TypeFactory factory;

    private UnknownAttribute[] unknownAttributes;

    private boolean haveAttributesBeenSet = false;

    public DefaultJCClass() {

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
        if (isOuterClass()) {
            return OUTER_ACCESS_FLAGS_MASK & accessFlags;
        } else {
            return NON_OUTER_ACCESS_FLAGS_MASK & accessFlags;
        }
    }

    @Override
    public void setAccessFlags(final int accessFlags) {
        initializeInnerClasses();
        this.accessFlags = accessFlags;
    }

    @Override
    public void setSuperName(final String superName) {
        initializeSignature();
        this.superName = superName;
    }

    @Override
    public void setSuperInterfaces(final String[] interfaces) {
        initializeSignature();
        this.interfaces = interfaces;
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
    public void setName(final String name) {
        this.name = name;
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
    public boolean isOuterClass() {
        return true;
    }

    @Override
    public boolean isInnerClass() {
        return false;
    }

    @Override
    public boolean isNestedClass() {
        return false;
    }

    @Override
    public boolean isLocalClass() {
        return false;
    }

    @Override
    public boolean isAnonymousClass() {
        return false;
    }

    @Override
    public boolean isMemberClass() {
        return false;
    }

    @Override
    public boolean isEnclosedClass() {
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
        throw new UnsupportedOperationException("oh helllllllll naw fam. This shit is so haram");
    }

    @Override
    public void setAttributes(final AttributeSet attributes) {
        if (haveAttributesBeenSet) {
            throw new IllegalStateException("attributes have already been set for the class.");
        }
        this.attributes = attributes;
        this.haveAttributesBeenSet = true;
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

    protected TypeFactory getFactory() {
        if (factory == null) {
            this.factory = new DefaultTypeFactory(this);
        }
        return factory;
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
        if (attributes == null || sourceFileInitialized) {
            return;
        }
        final SourceFileAttribute attribute = attributes.getAttribute(SourceFileAttribute.class);
        if (attribute != null) {
            this.sourceFile = attribute.getSourceFile();
        }

        // remove all attributes
        attributes.removeAttributes(SourceFileAttribute.class);

        updateAttributes();

        sourceFileInitialized = true;
    }

    private void initializeInnerClasses() {
        if (attributes == null || innerClassesInitialized) {
            return;
        }

        final InnerClassesAttribute attribute = attributes.getAttribute(InnerClassesAttribute.class);
        if (attribute != null) {
            final InnerClass[] innerClasses = attribute.getClasses();
            final List<JCClass> classList = new LinkedList<>();

            for (final InnerClass innerClass : innerClasses) {
                final String name = innerClass.getInnerClassInfo();
                final JCClass cls = JavaCore.getClass(name);

                final String outerInfo = innerClass.getOuterClassInfo();
                if (outerInfo != null && outerInfo.equals(this.name)) {
                    cls.setAccessFlags(innerClass.getInnerClassAccessFlags());
                    classList.add(cls);
                }
            }

            this.innerClasses = classList.toArray(new JCClass[classList.size()]);
        } else {
            this.innerClasses = new JCClass[0];
        }

        attributes.removeAttribute(InnerClassesAttribute.class);

        updateAttributes();

        innerClassesInitialized = true;
    }

    private void initializeEnclosingMethod() {
        if (attributes == null || enclosingMethodInitialized) {
            return;
        }

        // TODO

        enclosingMethodInitialized = true;
    }

    private void initializeSourceDebugExtension() {
        if (attributes == null || sourceDebugExtensionInitialized) {
            return;
        }
        final SourceDebugExtensionAttribute attribute = attributes.getAttribute(SourceDebugExtensionAttribute.class);
        if (attribute != null) {
            this.sourceDebugExtension = attribute.getDebugExtension();
        }

        // remove all attributes
        attributes.removeAttributes(SourceDebugExtensionAttribute.class);

        updateAttributes();

        sourceDebugExtensionInitialized = true;
    }

    private void initializeBootstrapMethods() {
        if (attributes == null || bootstrapMethodsInitialized) {
            return;
        }

        // TODO

        bootstrapMethodsInitialized = true;
    }

    private void initializeSynthetic() {
        if (attributes == null || syntheticInitialized) {
            return;
        }
        final SyntheticAttribute attribute = attributes.getAttribute(SyntheticAttribute.class);

        this.synthetic = (attribute != null);

        // remove all attributes
        attributes.removeAttributes(SyntheticAttribute.class);

        updateAttributes();

        syntheticInitialized = true;
    }

    private void initializeDeprecated() {
        if (attributes == null || deprecatedInitialized) {
            return;
        }
        final DeprecatedAttribute attribute = attributes.getAttribute(DeprecatedAttribute.class);

        this.deprecated = (attribute != null);

        // remove all attributes
        attributes.removeAttributes(DeprecatedAttribute.class);

        updateAttributes();

        deprecatedInitialized = true;
    }

    private void initializeSignature() {
        if (attributes == null || signatureInitialized) {
            return;
        }
        final SignatureAttribute attribute = attributes.getAttribute(SignatureAttribute.class);
        final String signatureValue;
        if (attribute != null) {
            signatureValue = attribute.getSignature();
        } else {
            signatureValue = SignatureParser.createSignature(superName, interfaces);
        }
        final SignatureParser parser = new SignatureParser(signatureValue);
        final ClassSignature signature = parser.parseClassSignature();
        final TypeFactory factory = getFactory();

        this.declaration = new DefaultClassGenericDeclaration(this, signature, factory);
        this.genericSuperClass = declaration.getGenericSuperClass();
        this.genericSuperInterfaces = declaration.getGenericSuperInterfaces();

        signatureInitialized = true;
    }

    private void initializeAnnotations() {
        if (attributes == null || annotationsInitialized) {
            return;
        }
        final RuntimeVisibleAnnotationsAttribute visibleAttribute = attributes.getAttribute(RuntimeVisibleAnnotationsAttribute.class);
        final RuntimeInvisibleAnnotationsAttribute invisibleAttribute = attributes.getAttribute(RuntimeInvisibleAnnotationsAttribute.class);

        final Set<Annotation> annotations = new LinkedHashSet<>();
        if (visibleAttribute != null) {
            Collections.addAll(annotations, visibleAttribute.getAnnotations());
        }
        if (invisibleAttribute != null) {
            Collections.addAll(annotations, invisibleAttribute.getAnnotations());
        }

        final int size = annotations.size();
        if (size != 0) {
            this.annotations = new Annotation[0];
        } else {
            this.annotations = annotations.toArray(new Annotation[size]);
        }

        // remove all
        attributes.removeAttributes(RuntimeVisibleAnnotationsAttribute.class);
        attributes.removeAttributes(RuntimeInvisibleAnnotationsAttribute.class);
        updateAttributes();
        annotationsInitialized = true;
    }

    private void initializeTypeAnnotations() {
        // type annotations require signature
        // be sure to double check!!
        initializeSignature();
        if (attributes == null || typeAnnotationsInitialized) {
            return;
        }

        // TODO

        typeAnnotationsInitialized = true;
    }

    private void initializeUnknownAttributes() {
        if (attributes == null || unknownAttributesInitialized) {
            return;
        }
        final Set<UnknownAttribute> unknowns = attributes.getAttributes(UnknownAttribute.class);
        if (unknowns == null || unknowns.isEmpty()) {
            this.unknownAttributes = new UnknownAttribute[0];
        } else {
            this.unknownAttributes = unknowns.toArray(new UnknownAttribute[unknowns.size()]);
        }

        // remove now that we're done with them
        attributes.removeAttributes(UnknownAttribute.class);
        updateAttributes();

        unknownAttributesInitialized = true;
    }

    private void updateAttributes() {
        if (attributes.isEmpty()) {
            attributes = null;
        }
    }
}
