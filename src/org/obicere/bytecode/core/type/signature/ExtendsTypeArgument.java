package org.obicere.bytecode.core.type.signature;

import org.obicere.bytecode.core.type.Type;
import org.obicere.bytecode.core.type.WildcardIndicator;
import org.obicere.bytecode.core.type.generation.TypeFactory;

/**
 * @author Obicere
 */
public class ExtendsTypeArgument implements TypeArgument {

    private final ReferenceTypeSignature signature;

    public ExtendsTypeArgument(final ReferenceTypeSignature signature) {
        if (signature == null) {
            throw new NullPointerException("signature must be non-null.");
        }
        this.signature = signature;
    }

    @Override
    public Type getType(final TypeFactory factory) {
        return factory.createWildcardType(WildcardIndicator.EXTENDS, signature);
    }
}
