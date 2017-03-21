package org.obicere.bytecode.core.reader.annotation.target;

import org.javacore.annotation.target.OffsetTarget;
import org.obicere.bytecode.core.objects.annotation.target.DefaultOffsetTarget;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class OffsetTargetReader implements Reader<OffsetTarget> {

    @Override
    public OffsetTarget read(final ByteCodeReader input) throws IOException {
        final int targetType = input.readUnsignedByte();
        final int offset = input.readUnsignedShort();
        return new DefaultOffsetTarget(targetType, offset);
    }
}
