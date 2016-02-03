package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.Annotation;
import org.obicere.bytecode.core.objects.RuntimeInvisibleAnnotationsAttribute;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class RuntimeInvisibleAnnotationsAttributeReader implements Reader<RuntimeInvisibleAnnotationsAttribute> {

    private final AnnotationReader annotation;

    public RuntimeInvisibleAnnotationsAttributeReader(final AnnotationReader annotation) {
        this.annotation = annotation;
    }

    @Override
    public RuntimeInvisibleAnnotationsAttribute read(final IndexedDataInputStream input) throws IOException {
        final int length = input.readInt();
        final int numAnnotations = input.readUnsignedShort();
        final Annotation[] annotations = new Annotation[numAnnotations];

        for (int i = 0; i < numAnnotations; i++) {
            annotations[i] = annotation.read(input);
        }
        return new RuntimeInvisibleAnnotationsAttribute(length, annotations);
    }
}
