package org.obicere.bytecode.core.objects.signature;

/**
 */
public abstract class WildcardIndicator extends AnnotationTarget {

    public static WildcardIndicator parse(final QueueString string){
        final QueueString save = string.save();
        final WildcardIndicator extendsBoundedWildcardIndicator = ExtendsBoundedWildcardIndicator.parse(string);
        if (extendsBoundedWildcardIndicator != null) {
            return extendsBoundedWildcardIndicator;
        }
        string.restoreTo(save);
        final WildcardIndicator superBoundedWildcardIndicator = SuperBoundedWildcardIndicator.parse(string);
        if (superBoundedWildcardIndicator != null) {
            return superBoundedWildcardIndicator;
        }
        string.restoreTo(save);

        return UnboundedWildcardIndicator.parse(string);
    }

}
