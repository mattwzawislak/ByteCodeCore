package org.obicere.bytecode.core.objects.signature;

import org.obicere.bytecode.core.objects.Annotation;
import org.obicere.bytecode.core.objects.Path;
import org.obicere.bytecode.core.objects.TypeAnnotation;
import org.obicere.bytecode.viewer.dom.DocumentBuilder;

import java.util.Iterator;

/**
 */
public class UnboundedWildcardIndicator extends WildcardIndicator {

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
    public void model(final DocumentBuilder builder) {
        for (final Annotation annotation : getAnnotations()) {
            annotation.model(builder);
        }
        builder.add("?");
    }
}
