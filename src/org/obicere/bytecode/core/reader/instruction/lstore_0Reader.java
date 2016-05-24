package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.lstore_0;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lstore_0Reader implements Reader<lstore_0> {

    @Override
    public lstore_0 read(final IndexedDataInputStream input) throws IOException {
        return lstore_0.INSTANCE;
    }
}