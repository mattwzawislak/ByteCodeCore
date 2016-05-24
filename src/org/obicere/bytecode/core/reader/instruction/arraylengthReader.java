package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.arraylength;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class arraylengthReader implements Reader<arraylength> {

    @Override
    public arraylength read(final IndexedDataInputStream input) throws IOException {
        return arraylength.INSTANCE;
    }
}
