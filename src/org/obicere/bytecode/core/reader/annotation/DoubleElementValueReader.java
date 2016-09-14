package org.obicere.bytecode.core.reader.annotation;

import org.obicere.bytecode.core.objects.annotation.DoubleElementValue;
import org.obicere.bytecode.core.objects.constant.ConstantDouble;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class DoubleElementValueReader implements Reader<DoubleElementValue> {
    @Override
    public DoubleElementValue read(final ByteCodeReader input) throws IOException {
        final ConstantDouble value = input.readConstant();
        return new DoubleElementValue(value.getBytes());
    }
}
