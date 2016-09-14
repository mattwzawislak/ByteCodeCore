package org.obicere.bytecode.core.reader.code.frame;

import org.obicere.bytecode.core.objects.code.frame.ChopFrame;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ChopFrameReader implements Reader<ChopFrame> {
    @Override
    public ChopFrame read(final ByteCodeReader input) throws IOException {
        final int frameType = input.readUnsignedByte();
        final int offsetDelta = input.readShort();
        return new ChopFrame(frameType, offsetDelta);
    }
}
