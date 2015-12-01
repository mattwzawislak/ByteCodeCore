package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.StackMapFrame;
import org.obicere.bytecode.core.objects.StackMapTableAttribute;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class StackMapTableAttributeReader implements Reader<StackMapTableAttribute> {

    private final StackMapFrameReader stackMapFrame = new StackMapFrameReader();

    @Override
    public StackMapTableAttribute read(final IndexedDataInputStream input) throws IOException {
        final int numberOfEntries = input.readUnsignedShort();
        final StackMapFrame[] entries = new StackMapFrame[numberOfEntries];
        for (int i = 0; i < numberOfEntries; i++) {
            entries[i] = stackMapFrame.read(input);
        }
        return new StackMapTableAttribute(entries);
    }
}
