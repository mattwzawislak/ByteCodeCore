package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.i2s;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class i2sReader implements Reader<i2s> {

    @Override
    public i2s read(final ByteCodeReader input) throws IOException {
        return i2s.INSTANCE;
    }
}