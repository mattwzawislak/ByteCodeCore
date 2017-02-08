package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultD2I;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class d2iReader implements Reader<DefaultD2I> {

    @Override
    public DefaultD2I read(final ByteCodeReader input) throws IOException {
        return DefaultD2I.INSTANCE;
    }
}