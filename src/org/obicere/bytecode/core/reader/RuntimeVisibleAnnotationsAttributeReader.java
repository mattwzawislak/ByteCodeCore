package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.Annotation;
import org.obicere.bytecode.core.objects.RuntimeVisibleAnnotationsAttribute;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class RuntimeVisibleAnnotationsAttributeReader implements Reader<RuntimeVisibleAnnotationsAttribute> {

    private final AnnotationReader annotation;

    public RuntimeVisibleAnnotationsAttributeReader(final AnnotationReader annotation) {
        this.annotation = annotation;
    }

    @Override
    public RuntimeVisibleAnnotationsAttribute read(final IndexedDataInputStream input) throws IOException {
        final int numAnnotations = input.readUnsignedShort();
        final Annotation[] annotations = new Annotation[numAnnotations];

        for (int i = 0; i < numAnnotations; i++) {
            annotations[i] = annotation.read(input);
        }
        return new RuntimeVisibleAnnotationsAttribute(annotations);
    }
}
