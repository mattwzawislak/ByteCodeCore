package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultD2F;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class d2fReader implements Reader<DefaultD2F> {

    @Override
    public DefaultD2F read(final ByteCodeReader input) throws IOException {
        return DefaultD2F.INSTANCE;
    }
}
