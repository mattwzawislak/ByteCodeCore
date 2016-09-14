package org.obicere.bytecode.core.objects.constant;

import org.obicere.bytecode.core.reader.constant.ConstantReader;

/**
 * @author Obicere
 */
public class ConstantNameAndType extends Constant {

    private final int nameIndex;

    private final int typeIndex;

    public ConstantNameAndType(final ConstantPool constantPool, final int nameIndex, final int typeIndex) {
        super(constantPool, ConstantReader.CONSTANT_NAME_AND_TYPE);
        this.nameIndex = nameIndex;
        this.typeIndex = typeIndex;
    }

    public String getName() {
        final ConstantUtf8 utf8 = constantPool.get(nameIndex);
        return utf8.getBytes();
    }

    public String getType() {
        final ConstantUtf8 utf8 = constantPool.get(typeIndex);
        return utf8.getBytes();
    }

    @Override
    public String toString() {
        return getType() + "::" + getName();
    }
}
