package org.obicere.bytecode.core.objects.annotation;

import org.javacore.annotation.ElementValue;
import org.javacore.annotation.ElementValuePair;

/**
 * @author Obicere
 */
public class DefaultElementValuePair implements ElementValuePair {

    private final String name;

    private final ElementValue value;

    public DefaultElementValuePair(final String name, final ElementValue value) {
        if (name == null) {
            throw new NullPointerException("name must be non-null");
        }
        if (value == null) {
            throw new NullPointerException("value must be non-null");
        }
        this.name = name;
        this.value = value;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ElementValue getValue() {
        return value;
    }
}
