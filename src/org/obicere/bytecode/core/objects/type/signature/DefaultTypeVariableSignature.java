package org.obicere.bytecode.core.objects.type.signature;

import org.javacore.type.Type;
import org.javacore.type.factory.TypeFactory;
import org.javacore.type.signature.TypeVariableSignature;

/**
 * @author Obicere
 */
public class DefaultTypeVariableSignature implements TypeVariableSignature {

    private final String identifier;

    public DefaultTypeVariableSignature(final String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String getIdentifier() {
        return identifier;
    }

    @Override
    public Type getType(final TypeFactory factory) {
        return factory.getGenericType(this);
    }
}
