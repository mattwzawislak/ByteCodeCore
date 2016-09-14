package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.i2l;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class i2lReader implements Reader<i2l> {

    @Override
    public i2l read(final ByteCodeReader input) throws IOException {
        return i2l.INSTANCE;
    }
}