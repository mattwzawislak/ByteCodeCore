package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.dstore_1;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dstore_1Reader implements Reader<dstore_1> {

    @Override
    public dstore_1 read(final IndexedDataInputStream input) throws IOException {
        return new dstore_1();
    }
}