package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.sastore;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class sastoreReader implements Reader<sastore> {

    @Override
    public sastore read(final IndexedDataInputStream input) throws IOException {
        return sastore.INSTANCE;
    }
}