package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.LongElementValue;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LongElementValueReader implements Reader<LongElementValue> {
    @Override
    public LongElementValue read(final IndexedDataInputStream input) throws IOException {
        return new LongElementValue(input.readUnsignedShort());
    }
}
