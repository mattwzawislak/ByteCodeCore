package org.obicere.bytecode.core.objects.type.signature;

import org.javacore.type.signature.SimpleClassTypeSignature;
import org.javacore.type.signature.TypeArgument;

/**
 * @author Obicere
 */
public class DefaultSimpleClassTypeSignature implements SimpleClassTypeSignature {

    private final String         identifier;
    private final TypeArgument[] arguments;

    public DefaultSimpleClassTypeSignature(final String identifier, final TypeArgument[] arguments) {
        this.identifier = identifier;
        this.arguments = arguments;
    }

    @Override
    public String getIdentifier() {
        return identifier;
    }

    @Override
    public TypeArgument[] getTypeArguments() {
        return arguments;
    }
}
