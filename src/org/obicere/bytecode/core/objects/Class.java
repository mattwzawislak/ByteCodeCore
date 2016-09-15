package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.Identifiable;
import org.obicere.bytecode.core.objects.attribute.AttributeSet;
import org.obicere.bytecode.core.objects.attribute.SignatureAttribute;
import org.obicere.bytecode.core.objects.constant.ConstantPool;
import org.obicere.bytecode.core.type.AccessibleTypeFactory;
import org.obicere.bytecode.core.type.ClassType;
import org.obicere.bytecode.core.type.GenericType;
import org.obicere.bytecode.core.type.ReferenceType;
import org.obicere.bytecode.core.type.generic.ClassGenericDeclaration;
import org.obicere.bytecode.core.type.parser.SignatureParser;
import org.obicere.bytecode.core.type.signature.ClassSignature;

/**
 * @author Obicere
 */
public class Class implements ClassType, Identifiable {

    public static final String IDENTIFIER = "ClassFile";

    private int minorVersion;

    private int majorVersion;

    private ConstantPool constantPool;

    private int accessFlags;

    private String name;

    private String superName;

    private String[] interfaces;

    private Field[] fields;

    private Method[] methods;

    private AttributeSet attributeSet;

    public Class() {

    }

    public Class(final int minorVersion, final int majorVersion, final ConstantPool constantPool, final int accessFlags, final String name, final String superName, final String[] interfaces, final Field[] fields, final Method[] methods, final AttributeSet attributeSet) {
        this.minorVersion = minorVersion;
        this.majorVersion = majorVersion;
        this.constantPool = constantPool;
        this.accessFlags = accessFlags;
        this.name = name;
        this.superName = superName;
        this.interfaces = interfaces;
        this.fields = fields;
        this.methods = methods;
        this.attributeSet = attributeSet;
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

    public int getAccessFlags() {
        return accessFlags;
    }

    public void setAccessFlags(final int accessFlags) {
        this.accessFlags = accessFlags;
    }

    public String getSuperName() {
        return superName;
    }

    public void setSuperName(final String superName) {
        this.superName = superName;
    }

    @Override
    public String getName() {
        return name;
    }

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

    public void setFields(final Field[] fields) {
        this.fields = fields;
    }

    @Override
    public ReferenceType getSuperClass() {
        return null;
    }

    @Override
    public ReferenceType[] getSuperInterfaces() {
        return null;
    }

    private volatile ClassType[] innerClasses;

    @Override
    public ReferenceType[] getInnerClasses() {
        return null;
    }

    @Override
    public ReferenceType getOuterClass() {
        return null;
    }

    @Override
    public GenericType[] getGenericTypes() {
        return null;
    }

    @Override
    public Method[] getMethods() {
        return methods;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }

    private volatile ClassGenericDeclaration declaration;

    @Override
    public ClassGenericDeclaration getDeclaration() {
        if (declaration == null) {

            final SignatureAttribute attribute = attributeSet.getAttribute(SignatureAttribute.class);
            if (attribute == null) {
                return null;
            }
            final String signature = attribute.getSignature();

            final AccessibleTypeFactory factory = new AccessibleTypeFactory(this);

            final SignatureParser parser = new SignatureParser(signature);

            final ClassSignature parsedSignature = parser.parseClassSignature();


            this.declaration = new ClassGenericDeclaration(this, parsedSignature, factory);
        }
        return declaration;
    }

    private class SimpleInformation {
        // access flags, package, simple name, canonical name
        private int accessFlags;

        private String packageName;

        private String simpleName;

        private String canonicalName;
    }

    private class InnerClassInformation {

        // inner class, enclosing class
    }

    private class AnnotationInformation {
        // annotations
    }

    private class DeclarationInformation {

        // signature (super class, interface, generic types),
    }

    private class BootstrappingInformation {

        // bootstrap methods
    }

    private class MiscellaneousInformation {

        // source file, source debug
    }
}
