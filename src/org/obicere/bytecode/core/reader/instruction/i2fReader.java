package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.i2f;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class i2fReader implements Reader<i2f> {

    @Override
    public i2f read(final IndexedDataInputStream input) throws IOException {
        return i2f.INSTANCE;
    }
}