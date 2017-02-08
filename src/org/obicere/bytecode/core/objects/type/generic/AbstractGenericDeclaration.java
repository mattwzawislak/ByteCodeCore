package org.obicere.bytecode.core.objects.type.generic;

import org.javacore.type.GenericType;
import org.javacore.type.factory.TypeFactory;
import org.javacore.type.generic.GenericDeclaration;
import org.javacore.type.generic.GenericDeclarationDeclarer;
import org.javacore.type.signature.TypeParameter;

/**
 * @author Obicere
 */
public abstract class AbstractGenericDeclaration<G extends GenericDeclarationDeclarer<? extends GenericDeclaration<G>>> implements GenericDeclaration<G> {

    private final TypeFactory factory;

    private volatile TypeParameter[] parameters;

    private volatile GenericType[] resolvedParameters;

    public AbstractGenericDeclaration(final TypeParameter[] parameters, final TypeFactory factory) {
        this.parameters = parameters;
        this.factory = factory;
    }

    @Override
    public TypeFactory getFactory() {
        return factory;
    }

    @Override
    public GenericType[] getGenericTypes() {
        GenericType[] types = resolvedParameters;
        if (types == null) {

            final GenericType[] newTypes = new GenericType[parameters.length];

            for (int i = 0; i < parameters.length; i++) {
                final TypeParameter parameter = parameters[i];

                // assert type is actually generic, it should be
                newTypes[i] = (GenericType) parameter.getType(factory);
            }

            // cache result
            types = newTypes;
            resolvedParameters = newTypes;
            // discard old result
            // not thread safe
            parameters = null;
        }
        return types;
    }

    @Override
    public GenericType getGenericType(final String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("invalid generic type name.");
        }
        for (final GenericType type : getGenericTypes()) {
            if (type != null && type.getName().equals(name)) {
                return type;
            }
        }
        // otherwise, we need to check an enclosing scope
        final GenericDeclaration outer = getOuterDeclaration();
        if (outer == null) {
            return null; // no luck
        } else {
            return outer.getGenericType(name);
        }
    }

}
