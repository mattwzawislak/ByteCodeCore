package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.aaload;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class aaloadReader implements Reader<aaload> {

    @Override
    public aaload read(final IndexedDataInputStream input) throws IOException {
        return aaload.INSTANCE;
    }
}
