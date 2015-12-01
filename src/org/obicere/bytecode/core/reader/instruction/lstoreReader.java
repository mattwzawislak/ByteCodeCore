package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.lstore;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lstoreReader implements Reader<lstore> {

    @Override
    public lstore read(final IndexedDataInputStream input) throws IOException {
        return new lstore(input.readUnsignedByte());
    }
}