package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.dstore_2;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dstore_2Reader implements Reader<dstore_2> {

    @Override
    public dstore_2 read(final IndexedDataInputStream input) throws IOException {
        return new dstore_2();
    }
}