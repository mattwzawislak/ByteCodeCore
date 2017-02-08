package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultL2D;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class l2dReader implements Reader<DefaultL2D> {

    @Override
    public DefaultL2D read(final ByteCodeReader input) throws IOException {
        return DefaultL2D.INSTANCE;
    }
}