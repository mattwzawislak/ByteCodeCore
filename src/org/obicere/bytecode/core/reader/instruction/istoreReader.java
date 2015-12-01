package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.istore;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class istoreReader implements Reader<istore> {

    @Override
    public istore read(final IndexedDataInputStream input) throws IOException {
        return new istore(input.readUnsignedByte());
    }
}