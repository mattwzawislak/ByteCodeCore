package org.obicere.bytecode.core.objects.meta;

import org.obicere.bytecode.core.objects.Attribute;
import org.obicere.bytecode.core.objects.AttributeSet;
import org.obicere.bytecode.core.objects.ClassFile;
import org.obicere.bytecode.core.objects.Constant;
import org.obicere.bytecode.core.objects.ConstantPool;
import org.obicere.bytecode.core.objects.Field;
import org.obicere.bytecode.core.objects.Method;

/**
 */
public final class MetaClassFile extends ClassFile {

    private static final ConstantPool EMPTY_CONSTANT_POOL = new ConstantPool(new Constant[0]);

    private static final int[] EMPTY_INTERFACES = new int[0];

    private static final Field[] EMPTY_FIELDS = new Field[0];

    private static final Method[] EMPTY_METHODS = new Method[0];

    private static final Attribute[] EMPTY_ATTRIBUTES = new Attribute[0];

    private final int    accessFlags;
    private final String thisClass;

    public MetaClassFile(final int accessFlags, final String thisClass) {
        super(0, 0, EMPTY_CONSTANT_POOL, 0, 0, 0, EMPTY_INTERFACES, EMPTY_FIELDS, EMPTY_METHODS, EMPTY_ATTRIBUTES);
        this.accessFlags = accessFlags;
        this.thisClass = thisClass;
    }

    @Override
    public int getAccessFlags() {
        return accessFlags;
    }

    @Override
    public String getName() {
        return thisClass;
    }

    @Override
    public boolean isMeta(){
        return true;
    }

    @Override
    public int getMinorVersion() {
        throw new UnsupportedOperationException("minor version is not available for meta class data.");
    }

    @Override
    public int getMajorVersion() {
        throw new UnsupportedOperationException("major version is not available for meta class data.");
    }

    @Override
    public ConstantPool getConstantPool() {
        throw new UnsupportedOperationException("constant pool is not available for meta class data.");
    }

    @Override
    public int getSuperClass() {
        throw new UnsupportedOperationException("super class index is not available for meta class data.");
    }

    @Override
    public String getSuperName() {
        throw new UnsupportedOperationException("super class name is not available for meta class data.");
    }

    @Override
    public int getThisClass() {
        throw new UnsupportedOperationException("this class index is not available for meta class data.");
    }

    @Override
    public int[] getInterfaces() {
        throw new UnsupportedOperationException("interfaces are not available for meta class data.");
    }

    @Override
    public String getInterface(final int index) {
        throw new UnsupportedOperationException("interfaces are not available for meta class data.");
    }

    @Override
    public Field[] getFields() {
        throw new UnsupportedOperationException("fields are not available for meta class data.");
    }

    @Override
    public Method[] getMethods() {
        throw new UnsupportedOperationException("methods are not available for meta class data.");
    }

    @Override
    public AttributeSet getAttributeSet() {
        throw new UnsupportedOperationException("attributes are not available for meta class data.");
    }
}
