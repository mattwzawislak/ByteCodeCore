package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.dstore_0;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dstore_0Reader implements Reader<dstore_0> {

    @Override
    public dstore_0 read(final IndexedDataInputStream input) throws IOException {
        return new dstore_0();
    }
}