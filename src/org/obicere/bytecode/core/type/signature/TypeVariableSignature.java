package org.obicere.bytecode.core.type.signature;

import org.obicere.bytecode.core.type.Type;
import org.obicere.bytecode.core.type.generation.TypeFactory;

/**
 * @author Obicere
 */
public class TypeVariableSignature implements ReferenceTypeSignature, ThrowsSignature {

    private final String identifier;

    public TypeVariableSignature(final String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public Type getType(final TypeFactory factory) {
        return factory.getGenericType(this);
    }
}
