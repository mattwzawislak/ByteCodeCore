package org.obicere.bytecode.core.reader.instruction;

import org.obicere.bytecode.core.objects.instruction.i2d;
import org.obicere.bytecode.core.util.IndexedDataInputStream;
import org.obicere.bytecode.core.reader.Reader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class i2dReader implements Reader<i2d> {

    @Override
    public i2d read(final IndexedDataInputStream input) throws IOException {
        return new i2d();
    }
}