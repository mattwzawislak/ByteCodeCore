package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultCAStore;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class castoreReader implements Reader<DefaultCAStore> {

    @Override
    public DefaultCAStore read(final ByteCodeReader input) throws IOException {
        return DefaultCAStore.INSTANCE;
    }
}
