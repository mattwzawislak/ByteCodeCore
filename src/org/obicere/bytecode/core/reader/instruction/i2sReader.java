package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.i2s;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class i2sReader implements Reader<i2s> {

    @Override
    public i2s read(final IndexedDataInputStream input) throws IOException {
        return new i2s();
    }
}