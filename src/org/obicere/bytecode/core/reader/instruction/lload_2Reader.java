package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.lload_2;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lload_2Reader implements Reader<lload_2> {

    @Override
    public lload_2 read(final IndexedDataInputStream input) throws IOException {
        return new lload_2();
    }
}