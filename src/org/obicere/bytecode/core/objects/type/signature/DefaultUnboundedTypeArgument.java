package org.obicere.bytecode.core.objects.type.signature;

import org.javacore.type.Type;
import org.javacore.type.WildCardIndicator;
import org.javacore.type.factory.TypeFactory;
import org.javacore.type.signature.UnboundedTypeArgument;

/**
 * @author Obicere
 */
public class DefaultUnboundedTypeArgument implements UnboundedTypeArgument {

    @Override
    public Type getType(final TypeFactory factory) {
        return factory.createWildcardType(WildCardIndicator.UNBOUNDED, null);
    }
}
