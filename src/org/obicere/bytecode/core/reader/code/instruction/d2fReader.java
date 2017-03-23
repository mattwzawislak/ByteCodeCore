package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.D2F;
import org.obicere.bytecode.core.objects.code.instruction.DefaultD2F;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class D2FReader implements Reader<D2F> {

    @Override
    public D2F read(final ByteCodeReader input) throws IOException {
        return DefaultD2F.INSTANCE;
    }
}
