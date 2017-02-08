package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultF2L;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class f2lReader implements Reader<DefaultF2L> {

    @Override
    public DefaultF2L read(final ByteCodeReader input) throws IOException {
        return DefaultF2L.INSTANCE;
    }
}