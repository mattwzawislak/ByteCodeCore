package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.fstore;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fstoreReader implements Reader<fstore> {

    @Override
    public fstore read(final ByteCodeReader input) throws IOException {
        return new fstore(input.readUnsignedByte());
    }
}