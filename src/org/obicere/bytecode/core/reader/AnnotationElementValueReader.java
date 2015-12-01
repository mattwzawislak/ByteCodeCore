package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.AnnotationElementValue;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class AnnotationElementValueReader implements Reader<AnnotationElementValue> {

    private final AnnotationReader annotationReader;

    public AnnotationElementValueReader(final AnnotationReader annotationReader) {
        this.annotationReader = annotationReader;
    }

    @Override
    public AnnotationElementValue read(final IndexedDataInputStream input) throws IOException {
        return new AnnotationElementValue(annotationReader.read(input));
    }
}
