package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.athrow;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class athrowReader implements Reader<athrow> {

    @Override
    public athrow read(final IndexedDataInputStream input) throws IOException {
        return athrow.INSTANCE;
    }
}
