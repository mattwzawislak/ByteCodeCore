package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.dstore;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dstoreReader implements Reader<dstore> {

    @Override
    public dstore read(final IndexedDataInputStream input) throws IOException {
        return new dstore(input.readUnsignedByte());
    }
}