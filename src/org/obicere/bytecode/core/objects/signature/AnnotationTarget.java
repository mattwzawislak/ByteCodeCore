package org.obicere.bytecode.core.objects.signature;

import org.obicere.bytecode.core.objects.Annotation;
import org.obicere.bytecode.core.objects.Identifiable;
import org.obicere.bytecode.core.objects.Path;
import org.obicere.bytecode.core.objects.TypeAnnotation;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 */
public abstract class AnnotationTarget implements Identifiable {

    private final Set<Annotation> annotations = new LinkedHashSet<>();

    public Set<Annotation> getAnnotations() {
        return annotations;
    }

    public void add(final Annotation annotation) {
        annotations.add(annotation);
    }

    public abstract void walk(final TypeAnnotation annotation, final Iterator<Path> path);

}
