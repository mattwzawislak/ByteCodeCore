package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.fload_1;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fload_1Reader implements Reader<fload_1> {

    @Override
    public fload_1 read(final IndexedDataInputStream input) throws IOException {
        return fload_1.INSTANCE;
    }
}