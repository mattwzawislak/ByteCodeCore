package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.ArrayElementValue;
import org.obicere.bytecode.core.objects.ElementValue;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ArrayElementValueReader implements Reader<ArrayElementValue> {

    private final ElementValueReader elementValue;

    public ArrayElementValueReader(final ElementValueReader elementValue) {
        this.elementValue = elementValue;
    }

    @Override
    public ArrayElementValue read(final IndexedDataInputStream input) throws IOException {
        final int numValues = input.readUnsignedShort();
        final ElementValue[] values = new ElementValue[numValues];

        for (int i = 0; i < numValues; i++) {
            values[i] = elementValue.read(input);
        }
        return new ArrayElementValue(values);
    }
}
