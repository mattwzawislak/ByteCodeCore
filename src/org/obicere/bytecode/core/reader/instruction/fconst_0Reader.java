package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.fconst_0;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fconst_0Reader implements Reader<fconst_0> {

    @Override
    public fconst_0 read(final IndexedDataInputStream input) throws IOException {
        return fconst_0.INSTANCE;
    }
}