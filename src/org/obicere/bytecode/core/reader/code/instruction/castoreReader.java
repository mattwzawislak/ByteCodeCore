package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.CAStore;
import org.obicere.bytecode.core.objects.code.instruction.DefaultCAStore;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class CAStoreReader implements Reader<CAStore> {

    @Override
    public CAStore read(final ByteCodeReader input) throws IOException {
        return DefaultCAStore.INSTANCE;
    }
}
