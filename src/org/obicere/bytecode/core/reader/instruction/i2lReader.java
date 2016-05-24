package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.i2l;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class i2lReader implements Reader<i2l> {

    @Override
    public i2l read(final IndexedDataInputStream input) throws IOException {
        return i2l.INSTANCE;
    }
}