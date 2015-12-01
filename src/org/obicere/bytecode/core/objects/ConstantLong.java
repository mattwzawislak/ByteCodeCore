package org.obicere.bytecode.core.objects;

import org.obicere.bytecode.viewer.dom.DocumentBuilder;
import org.obicere.bytecode.core.reader.ConstantReader;

/**
 * @author Obicere
 */
public class ConstantLong extends Constant {

    private static final String NAME = "Long";

    private final long bytes;

    public ConstantLong(final long bytes) {
        super(ConstantReader.CONSTANT_LONG);
        this.bytes = bytes;
    }

    public long getBytes() {
        return bytes;
    }

    @Override
    public String getName(){
        return NAME;
    }

    @Override
    public String toString(final ConstantPool constantPool) {
        return String.valueOf(bytes);
    }

    @Override
    public void modelValue(final DocumentBuilder builder) {
        builder.add(bytes);
    }
}
