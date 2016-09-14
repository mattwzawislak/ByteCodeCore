package org.obicere.bytecode.core.reader.annotation;

import org.obicere.bytecode.core.objects.annotation.IntegerElementValue;
import org.obicere.bytecode.core.objects.constant.ConstantInteger;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class IntegerElementValueReader implements Reader<IntegerElementValue> {
    @Override
    public IntegerElementValue read(final ByteCodeReader input) throws IOException {
        final ConstantInteger value = input.readConstant();
        return new IntegerElementValue(value.getBytes());
    }
}
