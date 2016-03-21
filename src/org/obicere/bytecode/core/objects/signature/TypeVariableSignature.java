package org.obicere.bytecode.core.objects.signature;

import org.obicere.bytecode.core.objects.Path;
import org.obicere.bytecode.core.objects.TypeAnnotation;

import java.util.Iterator;

/**
 */
public class TypeVariableSignature extends ReferenceTypeSignature {

    public static final String IDENTIFIER = "TypeVariableSignature";

    private final String name;

    private TypeVariableSignature(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static TypeVariableSignature parse(final QueueString string) {
        if (!string.hasNext() || string.next() != 'T') {
            return null;
        }
        final String identifier = string.nextIdentifier();
        if (identifier == null) {
            return null;
        }
        if (!string.hasNext() || string.next() != ';') {
            return null;
        }
        return new TypeVariableSignature(identifier);
    }

    @Override
    public void walk(final TypeAnnotation annotation, final Iterator<Path> path) {
        if (path.hasNext()) {
            return;
        }
        add(annotation);
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }

    @Override
    public String toString() {
        return name;
    }
}
