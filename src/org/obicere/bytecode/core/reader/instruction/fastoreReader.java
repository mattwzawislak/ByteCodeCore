package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.fastore;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fastoreReader implements Reader<fastore> {

    @Override
    public fastore read(final IndexedDataInputStream input) throws IOException {
        return fastore.INSTANCE;
    }
}