package org.obicere.bytecode.core.type.signature;

import org.obicere.bytecode.core.type.Type;
import org.obicere.bytecode.core.type.WildcardIndicator;
import org.obicere.bytecode.core.type.generation.TypeFactory;

/**
 * @author Obicere
 */
public class UnboundedTypeArgument implements TypeArgument {

    @Override
    public Type getType(final TypeFactory factory) {
        return factory.createWildcardType(WildcardIndicator.UNBOUNDED, null);
    }
}
