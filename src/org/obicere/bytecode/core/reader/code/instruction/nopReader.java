package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultNop;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class nopReader implements Reader<DefaultNop> {

    @Override
    public DefaultNop read(final ByteCodeReader input) throws IOException {
        return DefaultNop.INSTANCE;
    }
}