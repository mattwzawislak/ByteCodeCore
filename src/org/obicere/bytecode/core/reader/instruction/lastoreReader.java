package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.lastore;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lastoreReader implements Reader<lastore> {

    @Override
    public lastore read(final IndexedDataInputStream input) throws IOException {
        return lastore.INSTANCE;
    }
}