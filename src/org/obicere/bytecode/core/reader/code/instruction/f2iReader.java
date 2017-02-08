package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultF2I;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class f2iReader implements Reader<DefaultF2I> {

    @Override
    public DefaultF2I read(final ByteCodeReader input) throws IOException {
        return DefaultF2I.INSTANCE;
    }
}