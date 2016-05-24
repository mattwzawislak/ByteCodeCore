package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.fconst_2;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fconst_2Reader implements Reader<fconst_2> {

    @Override
    public fconst_2 read(final IndexedDataInputStream input) throws IOException {
        return fconst_2.INSTANCE;
    }
}