package org.obicere.bytecode.core.objects.constant;

import org.javacore.constant.ConstantDouble;
import org.obicere.bytecode.core.reader.constant.ConstantReader;

/**
 * @author Obicere
 */
public class DefaultConstantDouble extends AbstractConstant implements ConstantDouble {

    private final double bytes;

    public DefaultConstantDouble(final double bytes) {
        super(null, ConstantReader.CONSTANT_DOUBLE);
        this.bytes = bytes;
    }

    @Override
    public String toString() {
        return String.valueOf(bytes);
    }

    @Override
    public double getValue() {
        return bytes;
    }
}
