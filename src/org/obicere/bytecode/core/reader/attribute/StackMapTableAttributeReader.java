package org.obicere.bytecode.core.reader.attribute;

import org.javacore.Identifier;
import org.javacore.attribute.StackMapTableAttribute;
import org.javacore.code.frame.StackMapFrame;
import org.obicere.bytecode.core.objects.attribute.DefaultStackMapTableAttribute;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class StackMapTableAttributeReader implements Reader<StackMapTableAttribute> {

    @Override
    public StackMapTableAttribute read(final ByteCodeReader input) throws IOException {
        // read length and discard
        input.readInt();
        final int numberOfEntries = input.readUnsignedShort();
        final StackMapFrame[] entries = new StackMapFrame[numberOfEntries];
        for (int i = 0; i < numberOfEntries; i++) {
            entries[i] = input.read(Identifier.STACK_MAP_FRAME);
        }
        return new DefaultStackMapTableAttribute(entries);
    }
}
