package org.obicere.bytecode.core.objects.constant;

import org.obicere.bytecode.core.reader.constant.ConstantReader;

/**
 * @author Obicere
 */
public class ConstantFloat extends Constant {

    private final float bytes;

    public ConstantFloat(final float bytes) {
        super(null, ConstantReader.CONSTANT_FLOAT);
        this.bytes = bytes;
    }

    public float getBytes() {
        return bytes;
    }

    @Override
    public String toString() {
        return String.valueOf(bytes);
    }
}
