package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.StringElementValue;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class StringElementValueReader implements Reader<StringElementValue> {
    @Override
    public StringElementValue read(final IndexedDataInputStream input) throws IOException {
        return new StringElementValue(input.readUnsignedShort());
    }
}
