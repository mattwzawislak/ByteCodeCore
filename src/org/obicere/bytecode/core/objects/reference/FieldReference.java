package org.obicere.bytecode.core.objects.reference;

import org.javacore.JCField;

/**
 * @author Obicere
 */
public class FieldReference extends AbstractReference<JCField> {

    public FieldReference(final String containingClass, final String name, final String descriptor) {
        super(containingClass, name, descriptor);
    }

    @Override
    public JCField get() {
        // TODO lookup field - should require descriptor parsing
        return null;
    }
}
