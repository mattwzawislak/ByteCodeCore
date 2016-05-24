package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.lor;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lorReader implements Reader<lor> {

    @Override
    public lor read(final IndexedDataInputStream input) throws IOException {
        return lor.INSTANCE;
    }
}