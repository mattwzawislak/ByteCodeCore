package org.obicere.bytecode.core.reader.constant;

import org.obicere.bytecode.core.objects.constant.DefaultConstantDouble;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ConstantDoubleReader implements Reader<DefaultConstantDouble> {
    @Override
    public DefaultConstantDouble read(final ByteCodeReader input) throws IOException {
        return new DefaultConstantDouble(input.readDouble());
    }
}
