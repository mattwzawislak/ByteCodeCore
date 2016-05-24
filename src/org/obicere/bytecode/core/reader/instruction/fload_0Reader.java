package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.fload_0;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fload_0Reader implements Reader<fload_0> {

    @Override
    public fload_0 read(final IndexedDataInputStream input) throws IOException {
        return fload_0.INSTANCE;
    }
}