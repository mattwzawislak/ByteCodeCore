package org.obicere.bytecode.core.reader.annotation;

import org.javacore.annotation.DoubleElementValue;
import org.obicere.bytecode.core.objects.annotation.DefaultDoubleElementValue;
import org.obicere.bytecode.core.objects.constant.DefaultConstantDouble;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class DoubleElementValueReader implements Reader<DoubleElementValue> {
    @Override
    public DoubleElementValue read(final ByteCodeReader input) throws IOException {
        final DefaultConstantDouble value = input.readConstant();
        return new DefaultDoubleElementValue(value.getValue());
    }
}
