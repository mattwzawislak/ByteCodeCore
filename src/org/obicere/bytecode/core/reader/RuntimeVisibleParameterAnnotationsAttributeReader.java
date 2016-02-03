package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.Annotation;
import org.obicere.bytecode.core.objects.RuntimeVisibleParameterAnnotationsAttribute;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class RuntimeVisibleParameterAnnotationsAttributeReader implements Reader<RuntimeVisibleParameterAnnotationsAttribute> {

    private final AnnotationReader annotation;

    public RuntimeVisibleParameterAnnotationsAttributeReader(final AnnotationReader annotation) {
        this.annotation = annotation;
    }

    @Override
    public RuntimeVisibleParameterAnnotationsAttribute read(final IndexedDataInputStream input) throws IOException {
        final int length = input.readInt();
        final int numParameters = input.readUnsignedByte();
        final Annotation[][] annotations = new Annotation[numParameters][];

        for (int i = 0; i < numParameters; i++) {
            final int numAnnotations = input.readUnsignedShort();
            annotations[i] = new Annotation[numAnnotations];
            for(int j = 0; j < numAnnotations; j++){
                annotations[i][j] = annotation.read(input);
            }
        }
        return new RuntimeVisibleParameterAnnotationsAttribute(length, annotations);
    }
}
