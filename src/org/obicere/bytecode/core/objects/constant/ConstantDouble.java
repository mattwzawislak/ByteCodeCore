package org.obicere.bytecode.core.objects.constant;

import org.obicere.bytecode.core.reader.constant.ConstantReader;

/**
 * @author Obicere
 */
public class ConstantDouble extends Constant {

    private final double bytes;

    public ConstantDouble(final double bytes) {
        super(null, ConstantReader.CONSTANT_DOUBLE);
        this.bytes = bytes;
    }

    public double getBytes() {
        return bytes;
    }

    @Override
    public String toString() {
        return String.valueOf(bytes);
    }
}
