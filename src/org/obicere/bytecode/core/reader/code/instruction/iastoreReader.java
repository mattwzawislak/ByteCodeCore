package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.IAStore;
import org.obicere.bytecode.core.objects.code.instruction.DefaultIAStore;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class IAStoreReader implements Reader<IAStore> {

    @Override
    public IAStore read(final ByteCodeReader input) throws IOException {
        return DefaultIAStore.INSTANCE;
    }
}