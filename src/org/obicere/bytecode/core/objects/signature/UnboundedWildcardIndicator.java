package org.obicere.bytecode.core.objects.signature;

import org.obicere.bytecode.core.objects.Path;
import org.obicere.bytecode.core.objects.TypeAnnotation;

import java.util.Iterator;

/**
 */
public class UnboundedWildcardIndicator extends WildcardIndicator {

    public static final String IDENTIFIER = "UnboundedWildcardIndicator";

    public static UnboundedWildcardIndicator parse(final QueueString string) {
        if (string.hasNext() && string.next() != '*') {
            return null;
        }
        return new UnboundedWildcardIndicator();
    }

    @Override
    public void walk(final TypeAnnotation annotation, final Iterator<Path> path) {
        if (!path.hasNext()) {
            add(annotation);
            return;
        }
        final Path next = path.next();
        if (next.getTypePathKind() == Path.KIND_WILDCARD) {
            add(annotation);
        }
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
