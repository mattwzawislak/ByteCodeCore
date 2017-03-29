package org.obicere.bytecode.core.objects.constant;

import org.javacore.constant.ConstantLong;
import org.javacore.constant.Constants;

/**
 * @author Obicere
 */
public class DefaultConstantLong extends AbstractConstant implements ConstantLong {

    private final long bytes;

    public DefaultConstantLong(final long bytes) {
        super(null, Constants.CONSTANT_LONG);
        this.bytes = bytes;
    }

    @Override
    public long getValue() {
        return bytes;
    }

    @Override
    public String toString() {
        return String.valueOf(bytes);
    }
}
