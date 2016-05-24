package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.lconst_1;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lconst_1Reader implements Reader<lconst_1> {

    @Override
    public lconst_1 read(final IndexedDataInputStream input) throws IOException {
        return lconst_1.INSTANCE;
    }
}