package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.reader.ConstantReader;

/**
 * @author Obicere
 */
public class ConstantUtf8 extends Constant {

    public static final String IDENTIFIER = "ConstantUtf8";

    private static final String NAME = "Utf8";

    private final String bytes;

    public ConstantUtf8(final String bytes) {
        super(ConstantReader.CONSTANT_UTF8);
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
    public String getName() {
        return NAME;
    }

    @Override
    public String toString(final ConstantPool constantPool) {
        return bytes;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
