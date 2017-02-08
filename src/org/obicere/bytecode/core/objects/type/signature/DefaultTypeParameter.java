package org.obicere.bytecode.core.objects.type.signature;

import org.javacore.type.Type;
import org.javacore.type.factory.TypeFactory;
import org.javacore.type.signature.ReferenceTypeSignature;
import org.javacore.type.signature.TypeParameter;

/**
 * @author Obicere
 */
public class DefaultTypeParameter implements TypeParameter {

    private final String identifier;

    private final ReferenceTypeSignature classBound;

    private final ReferenceTypeSignature[] interfaceBounds;

    public DefaultTypeParameter(final String identifier, final ReferenceTypeSignature classBound, final ReferenceTypeSignature[] interfaceBounds) {
        this.identifier = identifier;
        this.classBound = classBound;
        this.interfaceBounds = interfaceBounds;
    }

    @Override
    public Type getType(final TypeFactory factory) {
        return factory.createGenericType(identifier, classBound, interfaceBounds);
    }

    @Override
    public String getIdentifier() {
        return identifier;
    }

    @Override
    public ReferenceTypeSignature getClassBound() {
        return classBound;
    }

    @Override
    public ReferenceTypeSignature[] getInterfaceBounds() {
        return interfaceBounds;
    }
}
