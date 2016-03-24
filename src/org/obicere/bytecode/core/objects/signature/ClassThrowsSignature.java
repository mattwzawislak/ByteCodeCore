package org.obicere.bytecode.core.objects.signature;

import org.obicere.bytecode.core.objects.Path;
import org.obicere.bytecode.core.objects.TypeAnnotation;

import java.util.Iterator;

/**
 */
public class ClassThrowsSignature extends ThrowsSignature {

    public static final String IDENTIFIER = "ClassThrowsSignature";

    private final ClassTypeSignature classTypeSignature;

    private ClassThrowsSignature(final ClassTypeSignature classTypeSignature) {
        this.classTypeSignature = classTypeSignature;
    }

    public ClassTypeSignature getClassTypeSignature() {
        return classTypeSignature;
    }

    public static ThrowsSignature parse(final QueueString string) {
        final ClassTypeSignature classTypeSignature = ClassTypeSignature.parse(string);
        if (classTypeSignature == null) {
            return null;
        }
        return new ClassThrowsSignature(classTypeSignature);
    }

    @Override
    public void walk(final TypeAnnotation annotation, final Iterator<Path> path) {
        classTypeSignature.walk(annotation, path);
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }

    @Override
    public String toString() {
        return classTypeSignature.toString();
    }
}
