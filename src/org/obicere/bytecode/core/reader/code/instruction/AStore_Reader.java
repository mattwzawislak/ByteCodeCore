package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.AStore;
import org.obicere.bytecode.core.objects.code.instruction.DefaultAStore;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class AStore_Reader implements Reader<AStore> {

    @Override
    public AStore read(final ByteCodeReader input) throws IOException {
        return new DefaultAStore(input.readUnsignedByte());
    }
}
