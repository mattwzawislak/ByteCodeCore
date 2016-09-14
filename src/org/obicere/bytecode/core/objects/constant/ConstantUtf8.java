package org.obicere.bytecode.core.objects.constant;

import org.obicere.bytecode.core.reader.constant.ConstantReader;

/**
 * @author Obicere
 */
public class ConstantUtf8 extends Constant {

    private final String bytes;

    public ConstantUtf8(final String bytes) {
        super(null, ConstantReader.CONSTANT_UTF8);
        if (bytes == null) {
            throw new NullPointerException("bytes must be non-null");
        }
        this.bytes = bytes;
    }

    public int length() {
        return bytes.length();
    }

    public String getBytes() {
        return bytes;
    }

    @Override
    public String toString() {
        return bytes;
    }
}
