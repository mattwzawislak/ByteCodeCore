package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.RuntimeVisibleTypeAnnotationsAttribute;
import org.obicere.bytecode.core.objects.TypeAnnotation;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class RuntimeVisibleTypeAnnotationsAttributeReader implements Reader<RuntimeVisibleTypeAnnotationsAttribute> {

    private final TypeAnnotationReader annotation;

    public RuntimeVisibleTypeAnnotationsAttributeReader(final TypeAnnotationReader annotation) {
        this.annotation = annotation;
    }

    @Override
    public RuntimeVisibleTypeAnnotationsAttribute read(final IndexedDataInputStream input) throws IOException {
        final int length = input.readInt();
        final int numAnnotations = input.readUnsignedShort();
        final TypeAnnotation[] annotations = new TypeAnnotation[numAnnotations];

        for (int i = 0; i < numAnnotations; i++) {
            annotations[i] = annotation.read(input);
        }
        return new RuntimeVisibleTypeAnnotationsAttribute(length, annotations);
    }
}
