package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultFStore;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fstoreReader implements Reader<DefaultFStore> {

    @Override
    public DefaultFStore read(final ByteCodeReader input) throws IOException {
        return new DefaultFStore(input.readUnsignedByte());
    }
}