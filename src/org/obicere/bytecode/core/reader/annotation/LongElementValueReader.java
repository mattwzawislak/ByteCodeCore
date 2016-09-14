package org.obicere.bytecode.core.reader.annotation;

import org.obicere.bytecode.core.objects.annotation.LongElementValue;
import org.obicere.bytecode.core.objects.constant.ConstantLong;
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
        return new LongElementValue(value.getBytes());
    }
}
