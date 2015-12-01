package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.FloatElementValue;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class FloatElementValueReader implements Reader<FloatElementValue> {
    @Override
    public FloatElementValue read(final IndexedDataInputStream input) throws IOException {
        return new FloatElementValue(input.readUnsignedShort());
    }
}
