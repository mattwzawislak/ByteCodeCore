package org.obicere.bytecode.core.reader.code.frame;

import org.javacore.code.frame.SameFrameExtended;
import org.obicere.bytecode.core.objects.code.frame.DefaultSameFrameExtended;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class SameFrameExtendedReader implements Reader<SameFrameExtended> {
    @Override
    public SameFrameExtended read(final ByteCodeReader input) throws IOException {
        final int frameType = input.readUnsignedByte();
        final int offsetDelta = input.readShort();
        return new DefaultSameFrameExtended(frameType, offsetDelta);
    }
}
