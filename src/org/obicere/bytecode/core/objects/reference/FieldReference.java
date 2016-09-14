package org.obicere.bytecode.core.objects.reference;

import org.obicere.bytecode.core.objects.Class;
import org.obicere.bytecode.core.objects.Field;

/**
 * @author Obicere
 */
public class FieldReference extends AbstractReference<Field> {

    public FieldReference(final String containingClass, final String name, final String descriptor) {
        super(containingClass, name, descriptor);
    }

    @Override
    public Field get() {
        // TODO lookup field - should require descriptor parsing
        return null;
    }
}
