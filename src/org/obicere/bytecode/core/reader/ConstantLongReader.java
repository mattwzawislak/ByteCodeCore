package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.ConstantLong;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ConstantLongReader implements Reader<ConstantLong> {
    @Override
    public ConstantLong read(final IndexedDataInputStream input) throws IOException {
        return new ConstantLong(input.readLong());
    }
}
