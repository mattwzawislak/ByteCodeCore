package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.F2D;
import org.obicere.bytecode.core.objects.code.instruction.DefaultF2D;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class F2DReader implements Reader<F2D> {

    @Override
    public F2D read(final ByteCodeReader input) throws IOException {
        return DefaultF2D.INSTANCE;
    }
}