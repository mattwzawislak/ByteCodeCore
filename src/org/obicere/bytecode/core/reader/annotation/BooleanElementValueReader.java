package org.obicere.bytecode.core.reader.annotation;

import org.obicere.bytecode.core.objects.annotation.BooleanElementValue;
import org.obicere.bytecode.core.objects.constant.ConstantInteger;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class BooleanElementValueReader implements Reader<BooleanElementValue> {
    @Override
    public BooleanElementValue read(final ByteCodeReader input) throws IOException {
        final ConstantInteger value = input.readConstant();
        return new BooleanElementValue(value.getBytes() != 0);
    }
}
