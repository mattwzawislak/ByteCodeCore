package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.iload_0;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iload_0Reader implements Reader<iload_0> {

    @Override
    public iload_0 read(final IndexedDataInputStream input) throws IOException {
        return new iload_0();
    }
}