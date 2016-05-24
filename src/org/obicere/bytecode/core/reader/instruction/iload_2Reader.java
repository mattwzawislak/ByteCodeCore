package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.iload_2;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iload_2Reader implements Reader<iload_2> {

    @Override
    public iload_2 read(final IndexedDataInputStream input) throws IOException {
        return iload_2.INSTANCE;
    }
}