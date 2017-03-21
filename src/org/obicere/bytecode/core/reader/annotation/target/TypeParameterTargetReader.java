package org.obicere.bytecode.core.reader.annotation.target;

import org.javacore.annotation.target.TypeParameterTarget;
import org.obicere.bytecode.core.objects.annotation.target.DefaultTypeParameterTarget;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class TypeParameterTargetReader implements Reader<TypeParameterTarget> {

    @Override
    public TypeParameterTarget read(final ByteCodeReader input) throws IOException {
        final int targetType = input.readUnsignedByte();
        final int typeParameterIndex = input.readUnsignedByte();
        return new DefaultTypeParameterTarget(targetType, typeParameterIndex);
    }
}
