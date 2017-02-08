package org.obicere.bytecode.core.objects.constant;

import org.javacore.constant.ConstantInteger;
import org.obicere.bytecode.core.reader.constant.ConstantReader;

/**
 * @author Obicere
 */
public class DefaultConstantInteger extends AbstractConstant implements ConstantInteger {

    private final int bytes;

    public DefaultConstantInteger(final int bytes) {
        super(null, ConstantReader.CONSTANT_INTEGER);
        this.bytes = bytes;
    }

    @Override
    public int getValue() {
        return bytes;
    }

    @Override
    public String toString() {
        return String.valueOf(bytes);
    }
}
