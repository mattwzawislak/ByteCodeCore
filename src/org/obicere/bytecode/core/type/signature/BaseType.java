package org.obicere.bytecode.core.type.signature;

import org.obicere.bytecode.core.type.Type;
import org.obicere.bytecode.core.type.generation.TypeFactory;

/**
 * @author Obicere
 */
public class BaseType implements JavaTypeSignature {

    private final char descriptor;

    public BaseType(final char descriptor) {
        this.descriptor = descriptor;
    }

    @Override
    public Type getType(final TypeFactory factory) {
        switch (descriptor) {
            case 'B':
                return factory.createByteType();
            case 'C':
                return factory.createCharType();
            case 'D':
                return factory.createDoubleType();
            case 'F':
                return factory.createFloatType();
            case 'I':
                return factory.createIntType();
            case 'J':
                return factory.createLongType();
            case 'S':
                return factory.createShortType();
            case 'Z':
                return factory.createBooleanType();
            default:
                throw new IllegalArgumentException("invalid descriptor character: " + descriptor);
        }
    }
}
