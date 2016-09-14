package org.obicere.bytecode.core.reader.annotation;

import org.obicere.bytecode.core.objects.annotation.ByteElementValue;
import org.obicere.bytecode.core.objects.constant.ConstantInteger;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ByteElementValueReader implements Reader<ByteElementValue> {
    @Override
    public ByteElementValue read(final ByteCodeReader input) throws IOException {
        final ConstantInteger value = input.readConstant();
        return new ByteElementValue((byte) value.getBytes());
    }
}
