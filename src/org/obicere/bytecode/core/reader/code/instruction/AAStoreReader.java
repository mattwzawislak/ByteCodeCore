package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.AAStore;
import org.obicere.bytecode.core.objects.code.instruction.DefaultAAStore;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class AAStoreReader implements Reader<AAStore> {

    @Override
    public AAStore read(final ByteCodeReader input) throws IOException {
        return DefaultAAStore.INSTANCE;
    }
}
