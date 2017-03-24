package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.F2I;
import org.obicere.bytecode.core.objects.code.instruction.DefaultF2I;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class F2IReader implements Reader<F2I> {

    @Override
    public F2I read(final ByteCodeReader input) throws IOException {
        return DefaultF2I.INSTANCE;
    }
}