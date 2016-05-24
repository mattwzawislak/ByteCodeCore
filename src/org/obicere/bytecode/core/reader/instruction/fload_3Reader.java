package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.fload_3;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fload_3Reader implements Reader<fload_3> {

    @Override
    public fload_3 read(final IndexedDataInputStream input) throws IOException {
        return fload_3.INSTANCE;
    }
}