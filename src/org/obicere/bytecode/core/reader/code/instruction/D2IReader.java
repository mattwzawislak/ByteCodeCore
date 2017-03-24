package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.D2I;
import org.obicere.bytecode.core.objects.code.instruction.DefaultD2I;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class D2IReader implements Reader<D2I> {

    @Override
    public D2I read(final ByteCodeReader input) throws IOException {
        return DefaultD2I.INSTANCE;
    }
}