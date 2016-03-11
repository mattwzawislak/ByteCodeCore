package org.obicere.bytecode.core.objects;

import java.util.HashSet;
import java.util.Set;

/**
 */
public class AttributeSet {

    private final Attribute[] attributes;

    public AttributeSet(final Attribute[] attributes) {
        this.attributes = attributes;
    }

    @SuppressWarnings("unchecked")
    public <T extends Attribute> Set<T> getAttributes(final Class<T> cls) {
        final Set<T> result = new HashSet<>();
        for (final Attribute attribute : attributes) {
            if (cls.isInstance(attribute)) {
                result.add((T) attribute);
            }
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    public <T extends Attribute> T getAttribute(final Class<T> cls) {
        for (final Attribute attribute : attributes) {
            if (cls.isInstance(attribute)) {
                return (T) attribute;
            }
        }
        return null;
    }

    public Attribute[] getAttributes() {
        return attributes;
    }
}
