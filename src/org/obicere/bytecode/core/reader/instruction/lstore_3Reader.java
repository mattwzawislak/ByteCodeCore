package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.lstore_3;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lstore_3Reader implements Reader<lstore_3> {

    @Override
    public lstore_3 read(final IndexedDataInputStream input) throws IOException {
        return lstore_3.INSTANCE;
    }
}