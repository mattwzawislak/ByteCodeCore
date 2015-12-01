package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.dconst_1;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dconst_1Reader implements Reader<dconst_1> {

    @Override
    public dconst_1 read(final IndexedDataInputStream input) throws IOException {
        return new dconst_1();
    }
}