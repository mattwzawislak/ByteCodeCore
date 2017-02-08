package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultSALoad;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class saloadReader implements Reader<DefaultSALoad> {

    @Override
    public DefaultSALoad read(final ByteCodeReader input) throws IOException {
        return DefaultSALoad.INSTANCE;
    }
}