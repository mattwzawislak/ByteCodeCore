package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.EnumElementValue;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class EnumElementValueReader implements Reader<EnumElementValue> {
    @Override
    public EnumElementValue read(final IndexedDataInputStream input) throws IOException {
        final int typeNameIndex = input.readUnsignedShort();
        final int constNameIndex = input.readUnsignedShort();
        return new EnumElementValue(typeNameIndex, constNameIndex);
    }
}
