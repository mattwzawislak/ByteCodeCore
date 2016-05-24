package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.fconst_1;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fconst_1Reader implements Reader<fconst_1> {

    @Override
    public fconst_1 read(final IndexedDataInputStream input) throws IOException {
        return fconst_1.INSTANCE;
    }
}