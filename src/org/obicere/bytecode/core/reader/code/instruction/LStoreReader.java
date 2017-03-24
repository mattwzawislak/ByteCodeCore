package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.LStore;
import org.obicere.bytecode.core.objects.code.instruction.DefaultLStore;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LStoreReader implements Reader<LStore> {

    @Override
    public LStore read(final ByteCodeReader input) throws IOException {
        return new DefaultLStore(input.readUnsignedByte());
    }
}