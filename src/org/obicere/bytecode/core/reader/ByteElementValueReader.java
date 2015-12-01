package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.ByteElementValue;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ByteElementValueReader implements Reader<ByteElementValue> {
    @Override
    public ByteElementValue read(final IndexedDataInputStream input) throws IOException {
        return new ByteElementValue(input.readUnsignedShort());
    }
}
