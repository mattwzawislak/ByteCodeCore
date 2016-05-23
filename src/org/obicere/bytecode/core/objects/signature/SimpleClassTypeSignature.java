package org.obicere.bytecode.core.objects.signature;

import org.obicere.bytecode.core.objects.Identifiable;

/**
 */
public class SimpleClassTypeSignature implements Identifiable {

    public static final String IDENTIFIER = "SimpleClassTypeSignature";

    private final String        name;
    private final TypeArguments typeArguments;

    public SimpleClassTypeSignature(final String name, final TypeArguments typeArguments) {
        this.name = name;
        this.typeArguments = typeArguments;
    }

    public String getName() {
        return name;
    }

    public TypeArguments getTypeArguments() {
        return typeArguments;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }

    public static SimpleClassTypeSignature parse(final QueueString string) {
        if (!string.hasNext()) {
            return null;
        }
        final String identifier = string.nextIdentifier();
        if (identifier == null) {
            return null;
        }
        final TypeArguments typeArguments = TypeArguments.parse(string);
        if (typeArguments == null) {
            return null;
        }

        return new SimpleClassTypeSignature(identifier, typeArguments);
    }

    @Override
    public String toString() {
        return name + typeArguments;
    }
}
