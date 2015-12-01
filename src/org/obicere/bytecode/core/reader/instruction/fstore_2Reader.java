package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.fstore_2;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fstore_2Reader implements Reader<fstore_2> {

    @Override
    public fstore_2 read(final IndexedDataInputStream input) throws IOException {
        return new fstore_2();
    }
}