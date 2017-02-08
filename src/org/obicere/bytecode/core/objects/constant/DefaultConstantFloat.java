package org.obicere.bytecode.core.objects.constant;

import org.javacore.constant.ConstantFloat;
import org.obicere.bytecode.core.reader.constant.ConstantReader;

/**
 * @author Obicere
 */
public class DefaultConstantFloat extends AbstractConstant implements ConstantFloat {

    private final float bytes;

    public DefaultConstantFloat(final float bytes) {
        super(null, ConstantReader.CONSTANT_FLOAT);
        this.bytes = bytes;
    }

    @Override
    public float getValue() {
        return bytes;
    }

    @Override
    public String toString() {
        return String.valueOf(bytes);
    }
}
