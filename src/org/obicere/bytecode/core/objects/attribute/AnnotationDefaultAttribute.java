package org.obicere.bytecode.core.objects.attribute;

import org.obicere.bytecode.core.objects.annotation.ElementValue;

/**
 * @author Obicere
 */
public class AnnotationDefaultAttribute extends Attribute {

    public static final String IDENTIFIER = "AnnotationDefaultAttribute";

    private final ElementValue defaultValue;

    public AnnotationDefaultAttribute(final ElementValue defaultValue) {
        if (defaultValue == null) {
            throw new NullPointerException("default value must be non-null");
        }
        this.defaultValue = defaultValue;
    }

    public ElementValue getDefaultValue() {
        return defaultValue;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
