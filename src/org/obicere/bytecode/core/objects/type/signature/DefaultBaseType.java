package org.obicere.bytecode.core.objects.type.signature;

import org.javacore.type.Type;
import org.javacore.type.factory.TypeFactory;
import org.javacore.type.signature.BaseType;

/**
 * @author Obicere
 */
public class DefaultBaseType implements BaseType {

    private final char descriptor;

    public DefaultBaseType(final char descriptor) {
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

    @Override
    public char getDescriptor() {
        return descriptor;
    }
}
