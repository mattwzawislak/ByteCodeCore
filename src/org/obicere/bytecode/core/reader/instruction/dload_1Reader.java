package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.dload_1;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dload_1Reader implements Reader<dload_1> {

    @Override
    public dload_1 read(final IndexedDataInputStream input) throws IOException {
        return dload_1.INSTANCE;
    }
}