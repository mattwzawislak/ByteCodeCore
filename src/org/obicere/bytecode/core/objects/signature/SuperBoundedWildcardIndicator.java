package org.obicere.bytecode.core.objects.signature;

import org.obicere.bytecode.core.objects.Path;
import org.obicere.bytecode.core.objects.TypeAnnotation;

import java.util.Iterator;

/**
 */
public class SuperBoundedWildcardIndicator extends WildcardIndicator {

    public static final String IDENTIFIER = "SuperBoundedWildcardIndicator";

    private final ReferenceTypeSignature referenceTypeSignature;

    private SuperBoundedWildcardIndicator(final ReferenceTypeSignature referenceTypeSignature) {
        this.referenceTypeSignature = referenceTypeSignature;
    }

    public ReferenceTypeSignature getReferenceTypeSignature() {
        return referenceTypeSignature;
    }

    public static SuperBoundedWildcardIndicator parse(final QueueString string) {
        if (!string.hasNext() && string.peek() != '-') {
            return null;
        }
        string.next();
        final ReferenceTypeSignature referenceTypeSignature = ReferenceTypeSignature.parse(string);
        if (referenceTypeSignature == null) {
            return null;
        }
        return new SuperBoundedWildcardIndicator(referenceTypeSignature);
    }

    @Override
    public void walk(final TypeAnnotation annotation, final Iterator<Path> path) {
        if (!path.hasNext()) {
            add(annotation);
            return;
        }
        final Path next = path.next();
        final int kind = next.getTypePathKind();
        if (kind == Path.KIND_WILDCARD) {
            add(annotation);
        } else if (kind == Path.KIND_TYPE_ARGUMENT) {
            referenceTypeSignature.walk(annotation, path);
        }
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }

    @Override
    public String toString() {
        return "? super " + referenceTypeSignature;
    }
}
