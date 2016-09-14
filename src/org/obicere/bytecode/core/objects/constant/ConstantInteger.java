package org.obicere.bytecode.core.objects.constant;

import org.obicere.bytecode.core.reader.constant.ConstantReader;

/**
 * @author Obicere
 */
public class ConstantInteger extends Constant {

    private final int bytes;

    public ConstantInteger(final int bytes) {
        super(null, ConstantReader.CONSTANT_INTEGER);
        this.bytes = bytes;
    }

    public int getBytes() {
        return bytes;
    }

    @Override
    public String toString() {
        return String.valueOf(bytes);
    }
}
