package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.aastore;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class aastoreReader implements Reader<aastore> {

    @Override
    public aastore read(final IndexedDataInputStream input) throws IOException {
        return aastore.INSTANCE;
    }
}
