package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.BAStore;
import org.obicere.bytecode.core.objects.code.instruction.DefaultBAStore;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class BAStoreReader implements Reader<BAStore> {

    @Override
    public BAStore read(final ByteCodeReader input) throws IOException {
        return DefaultBAStore.INSTANCE;
    }
}
