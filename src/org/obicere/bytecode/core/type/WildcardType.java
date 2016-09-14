package org.obicere.bytecode.core.type;

/**
 * @author Obicere
 */
public final class WildcardType implements Type {

    private final WildcardIndicator indicator;

    private final ReferenceType bound;

    WildcardType() {
        this(WildcardIndicator.UNBOUNDED, null);
    }

    WildcardType(final WildcardIndicator indicator, final ReferenceType bound) {
        if (indicator == null) {
            throw new NullPointerException("indicator must be non-null.");
        }
        this.indicator = indicator;
        this.bound = bound;
    }

    public WildcardIndicator getIndicator() {
        return indicator;
    }

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
}
