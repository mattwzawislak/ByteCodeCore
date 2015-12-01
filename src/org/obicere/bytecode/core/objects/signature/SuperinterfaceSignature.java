package org.obicere.bytecode.core.objects.signature;

import org.obicere.bytecode.core.objects.Path;
import org.obicere.bytecode.core.objects.TypeAnnotation;
import org.obicere.bytecode.viewer.dom.DocumentBuilder;

import java.util.Iterator;

/**
 */
public class SuperinterfaceSignature extends AnnotationTarget {

    private final ClassTypeSignature classTypeSignature;

    private SuperinterfaceSignature(final ClassTypeSignature classTypeSignature) {
        this.classTypeSignature = classTypeSignature;
    }

    public ClassTypeSignature getClassTypeSignature() {
        return classTypeSignature;
    }

    public static SuperinterfaceSignature parse(final QueueString string) {
        if (!string.hasNext()) {
            return null;
        }
        final ClassTypeSignature classTypeSignature = ClassTypeSignature.parse(string);
        if (classTypeSignature == null) {
            return null;
        }
        return new SuperinterfaceSignature(classTypeSignature);
    }

    @Override
    public void walk(final TypeAnnotation annotation, final Iterator<Path> path) {
        classTypeSignature.walk(annotation, path);
    }

    @Override
    public void model(final DocumentBuilder builder){
        classTypeSignature.model(builder);
    }
}
