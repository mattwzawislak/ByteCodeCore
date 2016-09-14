package org.obicere.bytecode.core.reader.annotation;

import org.obicere.bytecode.core.objects.annotation.StringElementValue;
import org.obicere.bytecode.core.objects.constant.ConstantUtf8;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class StringElementValueReader implements Reader<StringElementValue> {
    @Override
    public StringElementValue read(final ByteCodeReader input) throws IOException {
        final ConstantUtf8 value = input.readConstant();
        return new StringElementValue(value.getBytes());
    }
}
