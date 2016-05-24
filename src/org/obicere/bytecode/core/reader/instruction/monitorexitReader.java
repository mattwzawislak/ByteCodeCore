package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.monitorexit;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class monitorexitReader implements Reader<monitorexit> {

    @Override
    public monitorexit read(final IndexedDataInputStream input) throws IOException {
        return monitorexit.INSTANCE;
    }
}