package org.obicere.bytecode.core.reader.annotation;

import org.obicere.bytecode.core.objects.annotation.ShortElementValue;
import org.obicere.bytecode.core.objects.constant.ConstantInteger;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ShortElementValueReader implements Reader<ShortElementValue> {
    @Override
    public ShortElementValue read(final ByteCodeReader input) throws IOException {
        final ConstantInteger value = input.readConstant();
        return new ShortElementValue((short) value.getBytes());
    }
}
