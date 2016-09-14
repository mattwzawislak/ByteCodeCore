package org.obicere.bytecode.core.objects.constant;

import org.obicere.bytecode.core.reader.constant.ConstantReader;

/**
 * @author Obicere
 */
public class ConstantClass extends Constant {

    private final int nameIndex;

    public ConstantClass(final ConstantPool constantPool, final int nameIndex) {
        super(constantPool, ConstantReader.CONSTANT_CLASS);
        this.nameIndex = nameIndex;
    }

    public String getName() {
        final ConstantUtf8 constantName = constantPool.get(nameIndex);
        return constantName.getBytes();
    }

    @Override
    public String toString() {
        return getName();
    }
}
