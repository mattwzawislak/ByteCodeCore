package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultDStore;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dstoreReader implements Reader<DefaultDStore> {

    @Override
    public DefaultDStore read(final ByteCodeReader input) throws IOException {
        return new DefaultDStore(input.readUnsignedByte());
    }
}