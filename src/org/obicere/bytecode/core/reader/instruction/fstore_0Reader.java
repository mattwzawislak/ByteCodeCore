package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.fstore_0;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fstore_0Reader implements Reader<fstore_0> {

    @Override
    public fstore_0 read(final IndexedDataInputStream input) throws IOException {
        return new fstore_0();
    }
}