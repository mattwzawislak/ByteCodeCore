package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.lload_0;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lload_0Reader implements Reader<lload_0> {

    @Override
    public lload_0 read(final IndexedDataInputStream input) throws IOException {
        return lload_0.INSTANCE;
    }
}