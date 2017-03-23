package org.obicere.bytecode.core.reader.annotation;

import org.javacore.annotation.ShortElementValue;
import org.javacore.constant.ConstantInteger;
import org.obicere.bytecode.core.objects.annotation.DefaultShortElementValue;
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
        return new DefaultShortElementValue((short) value.getValue());
    }
}
