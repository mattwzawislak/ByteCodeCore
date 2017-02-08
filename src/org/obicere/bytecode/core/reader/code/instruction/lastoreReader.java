package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultLAStore;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lastoreReader implements Reader<DefaultLAStore> {

    @Override
    public DefaultLAStore read(final ByteCodeReader input) throws IOException {
        return DefaultLAStore.INSTANCE;
    }
}