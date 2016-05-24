package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.fstore_1;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fstore_1Reader implements Reader<fstore_1> {

    @Override
    public fstore_1 read(final IndexedDataInputStream input) throws IOException {
        return fstore_1.INSTANCE;
    }
}