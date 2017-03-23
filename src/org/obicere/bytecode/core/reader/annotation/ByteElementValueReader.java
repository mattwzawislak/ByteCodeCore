package org.obicere.bytecode.core.reader.annotation;

import org.javacore.annotation.ByteElementValue;
import org.javacore.constant.ConstantInteger;
import org.obicere.bytecode.core.objects.annotation.DefaultByteElementValue;
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
        return new DefaultByteElementValue((byte) value.getValue());
    }
}
