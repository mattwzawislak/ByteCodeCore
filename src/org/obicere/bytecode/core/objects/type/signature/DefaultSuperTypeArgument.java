package org.obicere.bytecode.core.objects.type.signature;

import org.javacore.type.Type;
import org.javacore.type.WildCardIndicator;
import org.javacore.type.factory.TypeFactory;
import org.javacore.type.signature.ReferenceTypeSignature;
import org.javacore.type.signature.SuperTypeArgument;

/**
 * @author Obicere
 */
public class DefaultSuperTypeArgument implements SuperTypeArgument {

    private final ReferenceTypeSignature signature;

    public DefaultSuperTypeArgument(final ReferenceTypeSignature signature) {
        if (signature == null) {
            throw new NullPointerException("signature must be non-null.");
        }
        this.signature = signature;
    }

    @Override
    public Type getType(final TypeFactory factory) {
        return factory.createWildcardType(WildCardIndicator.SUPER, signature);
    }

    @Override
    public ReferenceTypeSignature getSignature() {
        return signature;
    }
}
