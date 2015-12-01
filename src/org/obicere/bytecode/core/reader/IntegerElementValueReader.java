package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.IntegerElementValue;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class IntegerElementValueReader implements Reader<IntegerElementValue> {
    @Override
    public IntegerElementValue read(final IndexedDataInputStream input) throws IOException {
        return new IntegerElementValue(input.readUnsignedShort());
    }
}
