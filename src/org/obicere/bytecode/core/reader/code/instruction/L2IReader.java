package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.L2I;
import org.obicere.bytecode.core.objects.code.instruction.DefaultL2I;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class L2IReader implements Reader<L2I> {

    @Override
    public L2I read(final ByteCodeReader input) throws IOException {
        return DefaultL2I.INSTANCE;
    }
}