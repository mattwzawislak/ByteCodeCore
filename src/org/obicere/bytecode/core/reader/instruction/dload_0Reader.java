package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.dload_0;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dload_0Reader implements Reader<dload_0> {

    @Override
    public dload_0 read(final IndexedDataInputStream input) throws IOException {
        return dload_0.INSTANCE;
    }
}