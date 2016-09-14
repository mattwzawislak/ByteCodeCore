package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.dstore;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dstoreReader implements Reader<dstore> {

    @Override
    public dstore read(final ByteCodeReader input) throws IOException {
        return new dstore(input.readUnsignedByte());
    }
}