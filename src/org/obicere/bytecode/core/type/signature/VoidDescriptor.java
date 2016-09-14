package org.obicere.bytecode.core.type.signature;

import org.obicere.bytecode.core.type.Type;
import org.obicere.bytecode.core.type.generation.TypeFactory;

/**
 * @author Obicere
 */
public class VoidDescriptor implements Result {

    private static final VoidDescriptor INSTANCE = new VoidDescriptor();

    private VoidDescriptor() {

    }

    public static VoidDescriptor getInstance() {
        return INSTANCE;
    }

    @Override
    public Type getType(final TypeFactory factory) {
        return factory.createVoidType();
    }
}
