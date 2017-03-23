package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.D2L;
import org.obicere.bytecode.core.objects.code.instruction.DefaultD2L;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class D2LReader implements Reader<D2L> {

    @Override
    public D2L read(final ByteCodeReader input) throws IOException {
        return DefaultD2L.INSTANCE;
    }
}