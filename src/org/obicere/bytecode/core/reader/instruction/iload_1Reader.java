package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.iload_1;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iload_1Reader implements Reader<iload_1> {

    @Override
    public iload_1 read(final IndexedDataInputStream input) throws IOException {
        return new iload_1();
    }
}