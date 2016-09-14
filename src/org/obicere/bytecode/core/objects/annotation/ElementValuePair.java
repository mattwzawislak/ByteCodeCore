package org.obicere.bytecode.core.objects.annotation;

import org.obicere.bytecode.core.Identifiable;

/**
 * @author Obicere
 */
public class ElementValuePair implements Identifiable {

    public static final String IDENTIFIER = "ElementValuePair";

    private final String name;

    private final ElementValue value;

    public ElementValuePair(final String name, final ElementValue value) {
        if (name == null) {
            throw new NullPointerException("name must be non-null");
        }
        if (value == null) {
            throw new NullPointerException("value must be non-null");
        }
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public ElementValue getValue() {
        return value;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
