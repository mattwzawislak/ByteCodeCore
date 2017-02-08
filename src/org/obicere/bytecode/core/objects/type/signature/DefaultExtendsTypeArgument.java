package org.obicere.bytecode.core.objects.type.signature;

import org.javacore.type.Type;
import org.javacore.type.WildCardIndicator;
import org.javacore.type.factory.TypeFactory;
import org.javacore.type.signature.ExtendsTypeArgument;
import org.javacore.type.signature.ReferenceTypeSignature;

/**
 * @author Obicere
 */
public class DefaultExtendsTypeArgument implements ExtendsTypeArgument {

    private final ReferenceTypeSignature signature;

    public DefaultExtendsTypeArgument(final ReferenceTypeSignature signature) {
        if (signature == null) {
            throw new NullPointerException("signature must be non-null.");
        }
        this.signature = signature;
    }

    @Override
    public Type getType(final TypeFactory factory) {
        return factory.createWildcardType(WildCardIndicator.EXTENDS, signature);
    }

    @Override
    public ReferenceTypeSignature getSignature() {
        return signature;
    }
}
