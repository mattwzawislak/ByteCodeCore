package org.obicere.bytecode.core.type.signature;

import org.obicere.bytecode.core.type.Type;
import org.obicere.bytecode.core.type.generation.TypeFactory;

/**
 * @author Obicere
 */
public class TypeParameter implements TypeSignature {

    private final String identifier;

    private final ReferenceTypeSignature classBound;

    private final ReferenceTypeSignature[] interfaceBounds;

    public TypeParameter(final String identifier, final ReferenceTypeSignature classBound, final ReferenceTypeSignature[] interfaceBounds) {
        this.identifier = identifier;
        this.classBound = classBound;
        this.interfaceBounds = interfaceBounds;
    }

    @Override
    public Type getType(final TypeFactory factory) {
        return factory.createGenericType(identifier, classBound, interfaceBounds);
    }
}
