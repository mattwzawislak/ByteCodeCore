package org.obicere.bytecode.core.objects.signature;

import org.obicere.bytecode.core.objects.Path;
import org.obicere.bytecode.core.objects.TypeAnnotation;

import java.util.Iterator;

/**
 */
public class InterfaceBound extends AnnotationTarget {

    public static final String IDENTIFIER = "InterfaceBound";

    private final ReferenceTypeSignature referenceTypeSignature;

    private InterfaceBound(final ReferenceTypeSignature referenceTypeSignature) {
        this.referenceTypeSignature = referenceTypeSignature;
    }

    public ReferenceTypeSignature getReferenceTypeSignature() {
        return referenceTypeSignature;
    }

    public static InterfaceBound parse(final QueueString string) {
        if (!string.hasNext() || string.next() != ':') {
            return null;
        }
        final ReferenceTypeSignature referenceTypeSignature = ReferenceTypeSignature.parse(string);
        if (referenceTypeSignature == null) {
            return null;
        }
        return new InterfaceBound(referenceTypeSignature);
    }

    @Override
    public void walk(final TypeAnnotation annotation, final Iterator<Path> path) {
        referenceTypeSignature.walk(annotation, path);
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }

    @Override
    public String toString(){
        return referenceTypeSignature.toString();
    }
}
