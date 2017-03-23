package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.DStore;
import org.obicere.bytecode.core.objects.code.instruction.DefaultDStore;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class DStoreReader implements Reader<DStore> {

    @Override
    public DStore read(final ByteCodeReader input) throws IOException {
        return new DefaultDStore(input.readUnsignedByte());
    }
}