package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.FStore;
import org.obicere.bytecode.core.objects.code.instruction.DefaultFStore;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class FStoreReader implements Reader<FStore> {

    @Override
    public FStore read(final ByteCodeReader input) throws IOException {
        return new DefaultFStore(input.readUnsignedByte());
    }
}