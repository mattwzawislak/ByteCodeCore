package org.obicere.bytecode.core.reader.annotation;

import org.javacore.annotation.LongElementValue;
import org.javacore.constant.ConstantLong;
import org.obicere.bytecode.core.objects.annotation.DefaultLongElementValue;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LongElementValueReader implements Reader<LongElementValue> {
    @Override
    public LongElementValue read(final ByteCodeReader input) throws IOException {
        final ConstantLong value = input.readConstant();
        return new DefaultLongElementValue(value.getValue());
    }
}
