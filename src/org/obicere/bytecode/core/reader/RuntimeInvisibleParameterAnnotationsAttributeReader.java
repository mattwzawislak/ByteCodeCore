package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.Annotation;
import org.obicere.bytecode.core.objects.RuntimeInvisibleParameterAnnotationsAttribute;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class RuntimeInvisibleParameterAnnotationsAttributeReader implements Reader<RuntimeInvisibleParameterAnnotationsAttribute> {

    private final AnnotationReader annotation;

    public RuntimeInvisibleParameterAnnotationsAttributeReader(final AnnotationReader annotation) {
        this.annotation = annotation;
    }

    @Override
    public RuntimeInvisibleParameterAnnotationsAttribute read(final IndexedDataInputStream input) throws IOException {
        final int numParameters = input.readUnsignedByte();
        final Annotation[][] annotations = new Annotation[numParameters][];

        for (int i = 0; i < numParameters; i++) {
            final int numAnnotations = input.readUnsignedShort();
            annotations[i] = new Annotation[numAnnotations];
            for (int j = 0; j < numAnnotations; j++) {
                annotations[i][j] = annotation.read(input);
            }
        }
        return new RuntimeInvisibleParameterAnnotationsAttribute(annotations);
    }
}
