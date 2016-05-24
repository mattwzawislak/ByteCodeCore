package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.lconst_0;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lconst_0Reader implements Reader<lconst_0> {

    @Override
    public lconst_0 read(final IndexedDataInputStream input) throws IOException {
        return lconst_0.INSTANCE;
    }
}