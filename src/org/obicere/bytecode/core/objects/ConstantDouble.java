package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.core.reader.ConstantReader;

/**
 * @author Obicere
 */
public class ConstantDouble extends Constant {

    public static final String IDENTIFIER = "ConstantDouble";

    private static final String NAME = "Double";

    private final double bytes;

    public ConstantDouble(final double bytes) {
        super(ConstantReader.CONSTANT_DOUBLE);
        this.bytes = bytes;
    }

    public double getBytes() {
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
