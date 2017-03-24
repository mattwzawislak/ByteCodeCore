package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.LAStore;
import org.obicere.bytecode.core.objects.code.instruction.DefaultLAStore;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LAStoreReader implements Reader<LAStore> {

    @Override
    public LAStore read(final ByteCodeReader input) throws IOException {
        return DefaultLAStore.INSTANCE;
    }
}