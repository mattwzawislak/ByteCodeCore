package org.obicere.bytecode.core.objects.reference;

import org.obicere.bytecode.core.objects.Method;

/**
 * @author Obicere
 */
public class MethodReference extends AbstractReference<Method> {

    public MethodReference(final String containingClass, final String name, final String descriptor) {
        super(containingClass, name, descriptor);
        // if (containingClass.isInterface()) {
        //     throw new Error();
        // }
    }

    @Override
    public Method get() {
        // TODO lookup method - should require descriptor parsing
        return null;
    }
}
