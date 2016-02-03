package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.ConstantValueAttribute;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ConstantValueAttributeReader implements Reader<ConstantValueAttribute> {
    @Override
    public ConstantValueAttribute read(final IndexedDataInputStream input) throws IOException {
        final int length = input.readInt();
        final int constantValueIndex = input.readUnsignedShort();
        return new ConstantValueAttribute(length, constantValueIndex);
    }
}
