package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultD2L;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class d2lReader implements Reader<DefaultD2L> {

    @Override
    public DefaultD2L read(final ByteCodeReader input) throws IOException {
        return DefaultD2L.INSTANCE;
    }
}