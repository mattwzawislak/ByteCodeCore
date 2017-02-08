package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultL2I;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class l2iReader implements Reader<DefaultL2I> {

    @Override
    public DefaultL2I read(final ByteCodeReader input) throws IOException {
        return DefaultL2I.INSTANCE;
    }
}