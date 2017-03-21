package org.obicere.bytecode.core.reader.annotation.target;

import org.javacore.annotation.target.TypeParameterBoundTarget;
import org.obicere.bytecode.core.objects.annotation.target.DefaultTypeParameterBoundTarget;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class TypeParameterBoundTargetReader implements Reader<TypeParameterBoundTarget> {

    @Override
    public TypeParameterBoundTarget read(final ByteCodeReader input) throws IOException {
        final int targetType = input.readUnsignedByte();
        final int typeParameterIndex = input.readUnsignedByte();
        final int boundIndex = input.readUnsignedByte();
        return new DefaultTypeParameterBoundTarget(targetType, typeParameterIndex, boundIndex);
    }
}
