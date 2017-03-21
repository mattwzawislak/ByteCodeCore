package org.obicere.bytecode.core.reader.annotation.target;

import org.javacore.annotation.target.SuperTypeTarget;
import org.obicere.bytecode.core.objects.annotation.target.DefaultSuperTypeTarget;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class SuperTypeTargetReader implements Reader<SuperTypeTarget> {

    @Override
    public SuperTypeTarget read(final ByteCodeReader input) throws IOException {
        final int targetType = input.readUnsignedByte();
        final int superTypeTarget = input.readUnsignedShort();
        return new DefaultSuperTypeTarget(targetType, superTypeTarget);
    }
}
