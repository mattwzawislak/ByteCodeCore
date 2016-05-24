package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.i2c;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class i2cReader implements Reader<i2c> {

    @Override
    public i2c read(final IndexedDataInputStream input) throws IOException {
        return i2c.INSTANCE;
    }
}