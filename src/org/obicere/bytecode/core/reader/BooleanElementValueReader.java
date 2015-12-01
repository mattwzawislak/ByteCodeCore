package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.BooleanElementValue;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class BooleanElementValueReader implements Reader<BooleanElementValue> {
    @Override
    public BooleanElementValue read(final IndexedDataInputStream input) throws IOException {
        return new BooleanElementValue(input.readUnsignedShort());
    }
}
