package org.obicere.bytecode.core.objects.signature;

import org.obicere.bytecode.core.objects.ByteCodeElement;

import java.util.LinkedList;

/**
 */
public class TypeArguments extends ByteCodeElement {

    public static final String IDENTIFIER = "TypeArguments";

    private final TypeArgument[] typeArguments;

    public TypeArguments(final TypeArgument[] typeArguments) {
        this.typeArguments = typeArguments;
    }

    public TypeArgument[] getTypeArguments() {
        return typeArguments;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }

    public static TypeArguments parse(final QueueString string) {
        if (!string.hasNext()) {
            return null;
        }
        final LinkedList<TypeArgument> typeArguments = new LinkedList<>();
        if (string.peek() == '<') {
            string.next();
            // if there is no end
            // or, there are no arguments (needs at least one)
            if (!string.hasNext('>') || string.peek() == '>') {
                return null;
            }
            while (string.hasNext() && string.peek() != '>') {
                final TypeArgument typeArgument = TypeArgument.parse(string);
                if (typeArgument == null) {
                    return null;
                }
                typeArguments.add(typeArgument);
            }
            // consume the >
            string.next();
        }
        return new TypeArguments(typeArguments.toArray(new TypeArgument[typeArguments.size()]));
    }
}
