package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.FAStore;
import org.obicere.bytecode.core.objects.code.instruction.DefaultFAStore;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class FAStoreReader implements Reader<FAStore> {

    @Override
    public FAStore read(final ByteCodeReader input) throws IOException {
        return DefaultFAStore.INSTANCE;
    }
}