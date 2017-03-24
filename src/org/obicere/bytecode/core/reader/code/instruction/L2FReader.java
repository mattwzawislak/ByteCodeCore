package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.L2F;
import org.obicere.bytecode.core.objects.code.instruction.DefaultL2F;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class L2FReader implements Reader<L2F> {

    @Override
    public L2F read(final ByteCodeReader input) throws IOException {
        return DefaultL2F.INSTANCE;
    }
}