package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.dstore_3;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dstore_3Reader implements Reader<dstore_3> {

    @Override
    public dstore_3 read(final IndexedDataInputStream input) throws IOException {
        return dstore_3.INSTANCE;
    }
}