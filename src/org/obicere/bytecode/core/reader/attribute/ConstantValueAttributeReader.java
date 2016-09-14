package org.obicere.bytecode.core.reader.attribute;

import org.obicere.bytecode.core.objects.attribute.ConstantValueAttribute;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ConstantValueAttributeReader implements Reader<ConstantValueAttribute> {
    @Override
    public ConstantValueAttribute read(final ByteCodeReader input) throws IOException {
        // read length and discard
        input.readInt();
        final int constantValueIndex = input.readUnsignedShort();
        return new ConstantValueAttribute(constantValueIndex);
    }
}
