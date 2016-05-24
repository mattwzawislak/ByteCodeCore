package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.istore_2;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class istore_2Reader implements Reader<istore_2> {

    @Override
    public istore_2 read(final IndexedDataInputStream input) throws IOException {
        return istore_2.INSTANCE;
    }
}