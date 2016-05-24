package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.lrem;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lremReader implements Reader<lrem> {

    @Override
    public lrem read(final IndexedDataInputStream input) throws IOException {
        return lrem.INSTANCE;
    }
}