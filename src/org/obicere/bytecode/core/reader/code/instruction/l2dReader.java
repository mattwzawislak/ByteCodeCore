package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.L2D;
import org.obicere.bytecode.core.objects.code.instruction.DefaultL2D;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class L2DReader implements Reader<L2D> {

    @Override
    public L2D read(final ByteCodeReader input) throws IOException {
        return DefaultL2D.INSTANCE;
    }
}