package org.obicere.bytecode.core.reader.annotation;

import org.javacore.Identifier;
import org.javacore.annotation.ArrayElementValue;
import org.javacore.annotation.ElementValue;
import org.obicere.bytecode.core.objects.annotation.DefaultArrayElementValue;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ArrayElementValueReader implements Reader<ArrayElementValue> {
    @Override
    public ArrayElementValue read(final ByteCodeReader input) throws IOException {
        final int numValues = input.readUnsignedShort();
        final ElementValue[] values = new ElementValue[numValues];

        for (int i = 0; i < numValues; i++) {
            values[i] = input.read(Identifier.ELEMENT_VALUE);
        }
        return new DefaultArrayElementValue(values);
    }
}
