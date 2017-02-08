package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultCALoad;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class caloadReader implements Reader<DefaultCALoad> {

    @Override
    public DefaultCALoad read(final ByteCodeReader input) throws IOException {
        return DefaultCALoad.INSTANCE;
    }
}
