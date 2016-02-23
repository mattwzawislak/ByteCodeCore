package org.obicere.bytecode.core.objects.signature;

import org.obicere.bytecode.core.objects.Path;
import org.obicere.bytecode.core.objects.TypeAnnotation;

import java.util.Iterator;

/**
 */
public class ArrayTypeSignature extends ReferenceTypeSignature {

    public static final String IDENTIFIER = "ArrayTypeSignature";

    private final JavaTypeSignature signature;

    private ArrayTypeSignature(final JavaTypeSignature signature) {
        this.signature = signature;
    }

    public JavaTypeSignature getJavaTypeSignature() {
        return signature;
    }

    public static ArrayTypeSignature parse(final QueueString string) {
        if (!string.hasNext() || string.next() != '[') {
            return null;
        }
        final JavaTypeSignature signature = JavaTypeSignature.parse(string);
        if (signature == null) {
            return null;
        }
        return new ArrayTypeSignature(signature);
    }

    @Override
    public void walk(final TypeAnnotation annotation, final Iterator<Path> path) {
        if (!path.hasNext()) {
            add(annotation);
        } else {
            final Path next = path.next();
            if (next.getTypePathKind() == Path.KIND_ARRAY) {
                signature.walk(annotation, path);
            }
        }
    }

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }
}
