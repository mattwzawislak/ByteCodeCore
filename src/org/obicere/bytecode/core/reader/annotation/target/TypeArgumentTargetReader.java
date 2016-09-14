package org.obicere.bytecode.core.reader.annotation.target;

import org.obicere.bytecode.core.objects.annotation.target.TypeArgumentTarget;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class TypeArgumentTargetReader implements Reader<TypeArgumentTarget> {
    @Override
    public TypeArgumentTarget read(final ByteCodeReader input) throws IOException {
        final int targetType = input.readUnsignedByte();
        final int offset = input.readUnsignedShort();
        final int typeArgumentIndex = input.readUnsignedByte();
        return new TypeArgumentTarget(targetType, offset, typeArgumentIndex);
    }
}
