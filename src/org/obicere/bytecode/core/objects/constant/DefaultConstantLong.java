package org.obicere.bytecode.core.objects.constant;

import org.javacore.constant.ConstantLong;
import org.obicere.bytecode.core.reader.constant.ConstantReader;

/**
 * @author Obicere
 */
public class DefaultConstantLong extends AbstractConstant implements ConstantLong {

    private final long bytes;

    public DefaultConstantLong(final long bytes) {
        super(null, ConstantReader.CONSTANT_LONG);
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
