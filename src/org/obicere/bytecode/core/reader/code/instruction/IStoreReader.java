package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.IStore;
import org.obicere.bytecode.core.objects.code.instruction.DefaultIStore;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class IStoreReader implements Reader<IStore> {

    @Override
    public IStore read(final ByteCodeReader input) throws IOException {
        return new DefaultIStore(input.readUnsignedByte());
    }
}