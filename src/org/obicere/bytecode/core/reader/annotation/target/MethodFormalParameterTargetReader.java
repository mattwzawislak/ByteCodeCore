package org.obicere.bytecode.core.reader.annotation.target;

import org.obicere.bytecode.core.objects.annotation.target.MethodFormalParameterTarget;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class MethodFormalParameterTargetReader implements Reader<MethodFormalParameterTarget> {
    @Override
    public MethodFormalParameterTarget read(final ByteCodeReader input) throws IOException {
        final int targetType = input.readUnsignedByte();
        final int formalParameterIndex = input.readUnsignedByte();
        return new MethodFormalParameterTarget(targetType, formalParameterIndex);
    }
}
