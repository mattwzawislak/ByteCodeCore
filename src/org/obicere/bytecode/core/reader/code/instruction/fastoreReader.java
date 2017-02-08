package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultFAStore;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fastoreReader implements Reader<DefaultFAStore> {

    @Override
    public DefaultFAStore read(final ByteCodeReader input) throws IOException {
        return DefaultFAStore.INSTANCE;
    }
}