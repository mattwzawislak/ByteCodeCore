package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.i2b;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class i2bReader implements Reader<i2b> {

    @Override
    public i2b read(final ByteCodeReader input) throws IOException {
        return i2b.INSTANCE;
    }
}