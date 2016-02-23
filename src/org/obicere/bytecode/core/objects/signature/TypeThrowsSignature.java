package org.obicere.bytecode.core.objects.signature;

import org.obicere.bytecode.core.objects.Path;
import org.obicere.bytecode.core.objects.TypeAnnotation;

import java.util.Iterator;

/**
 */
public class TypeThrowsSignature extends ThrowsSignature {

    public static final String IDENTIFIER = "TypeThrowsSignature";

    private final TypeVariableSignature typeVariableSignature;

    private TypeThrowsSignature(final TypeVariableSignature typeVariableSignature) {
        this.typeVariableSignature = typeVariableSignature;
    }

    public TypeVariableSignature getTypeVariableSignature() {
        return typeVariableSignature;
    }

    public static ThrowsSignature parse(final QueueString string) {
        final TypeVariableSignature typeVariableSignature = TypeVariableSignature.parse(string);
        if (typeVariableSignature == null) {
            return null;
        }
        return new TypeThrowsSignature(typeVariableSignature);
    }

    @Override
    public void walk(final TypeAnnotation annotation, final Iterator<Path> path) {
        typeVariableSignature.walk(annotation, path);
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
