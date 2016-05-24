package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.lload_3;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lload_3Reader implements Reader<lload_3> {

    @Override
    public lload_3 read(final IndexedDataInputStream input) throws IOException {
        return lload_3.INSTANCE;
    }
}