package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.astore;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class astoreReader implements Reader<astore> {

    @Override
    public astore read(final IndexedDataInputStream input) throws IOException {
        return new astore(input.readUnsignedByte());
    }
}
