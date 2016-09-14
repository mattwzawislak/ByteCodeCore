package org.obicere.bytecode.core.reader.constant;

import org.obicere.bytecode.core.objects.constant.ConstantDouble;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ConstantDoubleReader implements Reader<ConstantDouble> {
    @Override
    public ConstantDouble read(final ByteCodeReader input) throws IOException {
        return new ConstantDouble(input.readDouble());
    }
}
