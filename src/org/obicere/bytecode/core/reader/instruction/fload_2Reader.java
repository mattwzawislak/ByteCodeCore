package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.fload_2;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fload_2Reader implements Reader<fload_2> {

    @Override
    public fload_2 read(final IndexedDataInputStream input) throws IOException {
        return fload_2.INSTANCE;
    }
}