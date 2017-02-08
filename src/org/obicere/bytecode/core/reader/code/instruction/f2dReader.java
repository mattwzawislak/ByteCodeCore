package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultF2D;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class f2dReader implements Reader<DefaultF2D> {

    @Override
    public DefaultF2D read(final ByteCodeReader input) throws IOException {
        return DefaultF2D.INSTANCE;
    }
}