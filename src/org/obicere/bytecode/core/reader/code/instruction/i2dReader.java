package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.i2d;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class i2dReader implements Reader<i2d> {

    @Override
    public i2d read(final ByteCodeReader input) throws IOException {
        return i2d.INSTANCE;
    }
}