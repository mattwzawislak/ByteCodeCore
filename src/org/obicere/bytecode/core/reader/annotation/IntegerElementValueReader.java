package org.obicere.bytecode.core.reader.annotation;

import org.javacore.annotation.IntegerElementValue;
import org.javacore.constant.ConstantInteger;
import org.obicere.bytecode.core.objects.annotation.DefaultIntegerElementValue;
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
        return new DefaultIntegerElementValue(value.getValue());
    }
}
