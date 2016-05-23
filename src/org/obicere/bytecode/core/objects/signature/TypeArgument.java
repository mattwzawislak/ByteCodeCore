package org.obicere.bytecode.core.objects.signature;

import org.obicere.bytecode.core.objects.Identifiable;

/**
 */
public class TypeArgument implements Identifiable {

    public static final String IDENTIFIER = "TypeArgument";

    private final WildcardIndicator wildcardIndicator;

    public TypeArgument(final WildcardIndicator wildcardIndicator) {
        this.wildcardIndicator = wildcardIndicator;
    }

    public static TypeArgument parse(final QueueString string) {
        final WildcardIndicator wildcardIndicator = WildcardIndicator.parse(string);
        if (wildcardIndicator == null) {
            return null;
        }
        return new TypeArgument(wildcardIndicator);
    }

    public WildcardIndicator getWildcardIndicator() {
        return wildcardIndicator;
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }

    @Override
    public String toString() {
        return wildcardIndicator.toString();
    }
}
