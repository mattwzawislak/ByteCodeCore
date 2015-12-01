package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.dconst_0;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dconst_0Reader implements Reader<dconst_0> {

    @Override
    public dconst_0 read(final IndexedDataInputStream input) throws IOException {
        return new dconst_0();
    }
}