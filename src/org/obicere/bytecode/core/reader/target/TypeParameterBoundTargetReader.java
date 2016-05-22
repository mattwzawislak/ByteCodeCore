package org.obicere.bytecode.core.reader.target;

import org.obicere.bytecode.core.objects.target.TypeParameterBoundTarget;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class TypeParameterBoundTargetReader implements Reader<TypeParameterBoundTarget> {

    @Override
    public TypeParameterBoundTarget read(final IndexedDataInputStream input) throws IOException {
        final int targetType = input.readUnsignedByte();
        final int typeParameterIndex = input.readUnsignedByte();
        final int boundIndex = input.readUnsignedByte();
        return new TypeParameterBoundTarget(targetType, typeParameterIndex, boundIndex);
    }
}
