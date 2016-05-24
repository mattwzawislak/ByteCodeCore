package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.fstore_3;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fstore_3Reader implements Reader<fstore_3> {

    @Override
    public fstore_3 read(final IndexedDataInputStream input) throws IOException {
        return fstore_3.INSTANCE;
    }
}