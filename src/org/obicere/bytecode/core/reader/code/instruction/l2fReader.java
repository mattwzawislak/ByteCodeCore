package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultL2F;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class l2fReader implements Reader<DefaultL2F> {

    @Override
    public DefaultL2F read(final ByteCodeReader input) throws IOException {
        return DefaultL2F.INSTANCE;
    }
}