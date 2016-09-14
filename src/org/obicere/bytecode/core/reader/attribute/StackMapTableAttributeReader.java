package org.obicere.bytecode.core.reader.attribute;

import org.obicere.bytecode.core.objects.attribute.StackMapTableAttribute;
import org.obicere.bytecode.core.objects.code.frame.StackMapFrame;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.reader.code.frame.StackMapFrameReader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class StackMapTableAttributeReader implements Reader<StackMapTableAttribute> {

    private final StackMapFrameReader stackMapFrame = new StackMapFrameReader();

    @Override
    public StackMapTableAttribute read(final ByteCodeReader input) throws IOException {
        // read length and discard
        input.readInt();
        final int numberOfEntries = input.readUnsignedShort();
        final StackMapFrame[] entries = new StackMapFrame[numberOfEntries];
        for (int i = 0; i < numberOfEntries; i++) {
            entries[i] = stackMapFrame.read(input);
        }
        return new StackMapTableAttribute(entries);
    }
}
