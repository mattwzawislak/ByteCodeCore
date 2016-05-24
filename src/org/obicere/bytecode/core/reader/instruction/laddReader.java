package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.ladd;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class laddReader implements Reader<ladd> {

    @Override
    public ladd read(final IndexedDataInputStream input) throws IOException {
        return ladd.INSTANCE;
    }
}