package org.obicere.bytecode.core.objects.signature;

import org.obicere.bytecode.core.objects.Path;
import org.obicere.bytecode.core.objects.TypeAnnotation;

import java.util.Iterator;

/**
 */
public class Result extends AnnotationTarget {

    public static final String IDENTIFIER = "Result";

    private final JavaTypeSignature javaTypeSignature;

    private Result(final JavaTypeSignature javaTypeSignature) {
        this.javaTypeSignature = javaTypeSignature;
    }

    public JavaTypeSignature getJavaTypeSignature() {
        return javaTypeSignature;
    }

    public static Result parse(final QueueString string) {
        if (!string.hasNext()) {
            return null;
        }
        final JavaTypeSignature signature = JavaTypeSignature.parse(string);
        if (signature == null) {
            return null;
        }
        return new Result(signature);
    }

    @Override
    public void walk(final TypeAnnotation annotation, final Iterator<Path> path) {
        javaTypeSignature.walk(annotation, path);
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
