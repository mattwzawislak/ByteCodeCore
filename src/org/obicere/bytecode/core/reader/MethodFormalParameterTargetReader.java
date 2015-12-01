package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.MethodFormalParameterTarget;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class MethodFormalParameterTargetReader implements Reader<MethodFormalParameterTarget> {
    @Override
    public MethodFormalParameterTarget read(final IndexedDataInputStream input) throws IOException {
        final int targetType = input.readUnsignedByte();
        final int formalParameterIndex = input.readUnsignedByte();
        return new MethodFormalParameterTarget(targetType, formalParameterIndex);
    }
}
