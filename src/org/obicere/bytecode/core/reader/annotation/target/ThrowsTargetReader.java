package org.obicere.bytecode.core.reader.annotation.target;

import org.javacore.annotation.target.ThrowsTarget;
import org.obicere.bytecode.core.objects.annotation.target.DefaultThrowsTarget;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ThrowsTargetReader implements Reader<ThrowsTarget> {

    @Override
    public ThrowsTarget read(final ByteCodeReader input) throws IOException {
        final int targetType = input.readUnsignedByte();
        final int throwsTypeIndex = input.readUnsignedShort();
        return new DefaultThrowsTarget(targetType, throwsTypeIndex);
    }
}
