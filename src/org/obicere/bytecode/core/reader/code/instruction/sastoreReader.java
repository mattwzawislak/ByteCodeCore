package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.SAStore;
import org.obicere.bytecode.core.objects.code.instruction.DefaultSAStore;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class SAStoreReader implements Reader<SAStore> {

    @Override
    public SAStore read(final ByteCodeReader input) throws IOException {
        return DefaultSAStore.INSTANCE;
    }
}