package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.lload_1;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lload_1Reader implements Reader<lload_1> {

    @Override
    public lload_1 read(final IndexedDataInputStream input) throws IOException {
        return new lload_1();
    }
}