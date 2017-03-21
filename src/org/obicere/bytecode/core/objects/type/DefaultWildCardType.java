package org.obicere.bytecode.core.objects.type;

import org.javacore.type.ReferenceType;
import org.javacore.type.WildCardIndicator;
import org.javacore.type.WildCardType;

/**
 * @author Obicere
 */
public final class DefaultWildCardType implements WildCardType {

    private final WildCardIndicator indicator;

    private final ReferenceType bound;

    public DefaultWildCardType() {
        this(WildCardIndicator.UNBOUNDED, null);
    }

    public DefaultWildCardType(final WildCardIndicator indicator, final ReferenceType bound) {
        if (indicator == null) {
            throw new NullPointerException("indicator must be non-null.");
        }
        this.indicator = indicator;
        this.bound = bound;
    }

    @Override
    public WildCardIndicator getBoundType() {
        return indicator;
    }

    @Override
    public ReferenceType getBound() {
        return bound;
    }

    @Override
    public String getName() {
        return "?";
    }

    @Override
    public String getSimpleName() {
        return "?";
    }

    @Override
    public String getCanonicalName() {
        return "?";
    }

    @Override
    public boolean isPrimitive() {
        return false;
    }

    @Override
    public boolean isGeneric() {
        return true;
    }

    @Override
    public boolean isArray() {
        return false;
    }

    @Override
    public boolean isReference() {
        return false;
    }
}
