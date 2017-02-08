package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultLALoad;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class laloadReader implements Reader<DefaultLALoad> {

    @Override
    public DefaultLALoad read(final ByteCodeReader input) throws IOException {
        return DefaultLALoad.INSTANCE;
    }
}