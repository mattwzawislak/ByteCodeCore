package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.ShortElementValue;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ShortElementValueReader implements Reader<ShortElementValue> {
    @Override
    public ShortElementValue read(final IndexedDataInputStream input) throws IOException {
        return new ShortElementValue(input.readUnsignedShort());
    }
}
