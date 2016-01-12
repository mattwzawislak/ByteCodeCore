package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.reader.ConstantReader;

/**
 * @author Obicere
 */
public class ConstantFloat extends Constant {

    public static final String IDENTIFIER = "ConstantFloat";

    private static final String NAME = "Float";

    private final float bytes;

    public ConstantFloat(final float bytes) {
        super(ConstantReader.CONSTANT_FLOAT);
        this.bytes = bytes;
    }

    public float getBytes() {
        return bytes;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public String toString(final ConstantPool constantPool) {
        return String.valueOf(bytes);
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
