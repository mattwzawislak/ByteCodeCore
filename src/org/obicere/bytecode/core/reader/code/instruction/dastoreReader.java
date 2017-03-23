package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.DAStore;
import org.obicere.bytecode.core.objects.code.instruction.DefaultDAStore;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class DAStoreReader implements Reader<DAStore> {

    @Override
    public DAStore read(final ByteCodeReader input) throws IOException {
        return DefaultDAStore.INSTANCE;
    }
}