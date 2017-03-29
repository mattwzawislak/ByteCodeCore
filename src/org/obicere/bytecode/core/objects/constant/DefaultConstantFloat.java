package org.obicere.bytecode.core.objects.constant;

import org.javacore.constant.ConstantFloat;
import org.javacore.constant.Constants;

/**
 * @author Obicere
 */
public class DefaultConstantFloat extends AbstractConstant implements ConstantFloat {

    private final float bytes;

    public DefaultConstantFloat(final float bytes) {
        super(null, Constants.CONSTANT_FLOAT);
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
