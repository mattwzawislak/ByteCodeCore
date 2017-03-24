package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.F2L;
import org.obicere.bytecode.core.objects.code.instruction.DefaultF2L;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class F2LReader implements Reader<F2L> {

    @Override
    public F2L read(final ByteCodeReader input) throws IOException {
        return DefaultF2L.INSTANCE;
    }
}