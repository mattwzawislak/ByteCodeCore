package org.obicere.bytecode.core.objects.constant;

import org.obicere.bytecode.core.reader.constant.ConstantReader;

/**
 * @author Obicere
 */
public class ConstantString extends Constant {

    private final int stringIndex;

    public ConstantString(final ConstantPool constantPool, final int stringIndex) {
        super(constantPool, ConstantReader.CONSTANT_STRING);
        this.stringIndex = stringIndex;
    }

    public String getBytes() {
        final ConstantUtf8 constant = constantPool.get(stringIndex);

        return constant.getBytes();
    }

    @Override
    public String toString() {
        return getBytes();
    }
}
