package org.obicere.bytecode.core.objects.reference;

import org.javacore.JCMethod;

/**
 * @author Obicere
 */
public class MethodReference extends AbstractReference<JCMethod> {

    public MethodReference(final String containingClass, final String name, final String descriptor) {
        super(containingClass, name, descriptor);
        // if (containingClass.isInterface()) {
        //     throw new Error();
        // }
    }

    @Override
    public JCMethod get() {
        // TODO lookup method - should require descriptor parsing
        return null;
    }
}
