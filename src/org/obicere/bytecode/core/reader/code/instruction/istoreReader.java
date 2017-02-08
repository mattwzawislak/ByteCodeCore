package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultIStore;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class istoreReader implements Reader<DefaultIStore> {

    @Override
    public DefaultIStore read(final ByteCodeReader input) throws IOException {
        return new DefaultIStore(input.readUnsignedByte());
    }
}