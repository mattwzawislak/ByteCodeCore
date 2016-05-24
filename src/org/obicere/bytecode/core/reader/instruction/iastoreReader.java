package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.iastore;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iastoreReader implements Reader<iastore> {

    @Override
    public iastore read(final IndexedDataInputStream input) throws IOException {
        return iastore.INSTANCE;
    }
}