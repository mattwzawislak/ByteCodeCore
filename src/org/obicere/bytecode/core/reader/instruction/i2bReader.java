package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.i2b;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class i2bReader implements Reader<i2b> {

    @Override
    public i2b read(final IndexedDataInputStream input) throws IOException {
        return i2b.INSTANCE;
    }
}