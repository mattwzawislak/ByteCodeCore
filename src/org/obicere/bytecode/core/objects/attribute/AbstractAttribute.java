package org.obicere.bytecode.core.objects.attribute;

import org.javacore.attribute.Attribute;

/**
 * @author Obicere
 */
public abstract class AbstractAttribute implements Attribute {

    private final String name;

    public AbstractAttribute(final String name) {
        this.name = name;
    }

    @Override
    public String getAttributeName() {
        return name;
    }
}
