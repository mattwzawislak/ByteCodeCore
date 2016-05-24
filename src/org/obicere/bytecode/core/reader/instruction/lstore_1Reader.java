package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.lstore_1;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lstore_1Reader implements Reader<lstore_1> {

    @Override
    public lstore_1 read(final IndexedDataInputStream input) throws IOException {
        return lstore_1.INSTANCE;
    }
}