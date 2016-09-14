package org.obicere.bytecode.core.objects.constant;

import org.obicere.bytecode.core.reader.constant.ConstantReader;

/**
 * @author Obicere
 */
public class ConstantLong extends Constant {

    private final long bytes;

    public ConstantLong(final long bytes) {
        super(null, ConstantReader.CONSTANT_LONG);
        this.bytes = bytes;
    }

    public long getBytes() {
        return bytes;
    }

    @Override
    public String toString() {
        return String.valueOf(bytes);
    }
}
