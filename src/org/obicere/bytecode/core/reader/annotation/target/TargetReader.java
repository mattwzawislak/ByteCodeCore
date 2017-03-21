package org.obicere.bytecode.core.reader.annotation.target;

import org.javacore.Identifier;
import org.javacore.annotation.target.Target;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class TargetReader implements Reader<Target> {

    // TODO should this be converted to a multi-reader?
    // it fits the concept, but the implementation differs

    @Override
    public Target read(final ByteCodeReader input) throws IOException {
        final int targetType = input.peek();
        final Identifier type = getType(targetType);
        return input.read(type);
    }

    private Identifier getType(final int targetType) {
        switch (targetType) {

            // type 1 values
            case 0x0:
            case 0x1:
                return Identifier.TYPE_PARAMETER_TARGET;
            case 0x10:
                return Identifier.SUPER_TYPE_TARGET;
            case 0x11:
            case 0x12:
                return Identifier.TYPE_PARAMETER_BOUND_TARGET;
            case 0x13:
            case 0x14:
            case 0x15:
                return Identifier.EMPTY_TARGET;
            case 0x16:
                return Identifier.METHOD_FORMAL_PARAMETER_TARGET;
            case 0x17:
                return Identifier.THROWS_TARGET;

            // type 2 values
            case 0x40:
            case 0x41:
                return Identifier.LOCAL_VAR_TARGET;
            case 0x42:
                return Identifier.CATCH_TARGET;
            case 0x43:
            case 0x44:
            case 0x45:
            case 0x46:
                return Identifier.OFFSET_TARGET;
            case 0x47:
            case 0x48:
            case 0x49:
            case 0x4A:
            case 0x4B:
                return Identifier.TYPE_ARGUMENT_TARGET;
            default:
                throw new ClassFormatError("invalid target type value: " + targetType);
        }
    }
}
