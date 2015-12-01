package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.fstore;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fstoreReader implements Reader<fstore> {

    @Override
    public fstore read(final IndexedDataInputStream input) throws IOException {
        return new fstore(input.readUnsignedByte());
    }
}