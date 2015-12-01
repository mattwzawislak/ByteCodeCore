package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.DoubleElementValue;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class DoubleElementValueReader implements Reader<DoubleElementValue> {
    @Override
    public DoubleElementValue read(final IndexedDataInputStream input) throws IOException {
        return new DoubleElementValue(input.readUnsignedShort());
    }
}
