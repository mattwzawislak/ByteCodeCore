package org.obicere.bytecode.core.objects;

/**
 * @author Obicere
 */
public class ClassFile implements Identifiable {

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

    public ClassFile(final int minorVersion, final int majorVersion, final ConstantPool constantPool, final int accessFlags, final int thisClass, final int superClass, final int[] interfaces, final Field[] fields, final Method[] methods, final Attribute[] attributes) {
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

    public int getSuperClass() {
        return superClass;
    }

    public String getSuperName() {
        return constantPool.getAsString(superClass);
    }

    public int getThisClass() {
        return thisClass;
    }

    public String getName() {
        return constantPool.getAsString(thisClass);
    }

    public int[] getInterfaces() {
        return interfaces;
    }

    public String getInterface(final int index) {
        return constantPool.getAsString(index);
    }

    public Field[] getFields() {
        return fields;
    }

    public Method[] getMethods() {
        return methods;
    }

    public AttributeSet getAttributeSet() {
        return attributeSet;
    }

    public boolean isMeta(){
        return false;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
