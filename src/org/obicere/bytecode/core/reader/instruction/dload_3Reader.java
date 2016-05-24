package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.dload_3;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dload_3Reader implements Reader<dload_3> {

    @Override
    public dload_3 read(final IndexedDataInputStream input) throws IOException {
        return dload_3.INSTANCE;
    }
}