package org.obicere.bytecode.core.objects.type.signature;

import org.javacore.type.Type;
import org.javacore.type.factory.TypeFactory;
import org.javacore.type.signature.VoidDescriptor;

/**
 * @author Obicere
 */
public class DefaultVoidDescriptor implements org.javacore.type.signature.VoidDescriptor {

    private static final VoidDescriptor INSTANCE = new DefaultVoidDescriptor();

    private DefaultVoidDescriptor() {

    }

    public static VoidDescriptor getInstance() {
        return INSTANCE;
    }

    @Override
    public Type getType(final TypeFactory factory) {
        return factory.createVoidType();
    }
}
