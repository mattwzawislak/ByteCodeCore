package org.obicere.bytecode.core.reader.code.frame;

import org.javacore.code.frame.SameFrame;
import org.obicere.bytecode.core.objects.code.frame.DefaultSameFrame;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class SameFrameReader implements Reader<SameFrame> {
    @Override
    public SameFrame read(final ByteCodeReader input) throws IOException {
        final int frameType = input.readUnsignedByte();
        return new DefaultSameFrame(frameType);
    }
}
