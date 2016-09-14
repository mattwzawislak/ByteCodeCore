package org.obicere.bytecode.core.reader.annotation;

import org.obicere.bytecode.core.objects.annotation.AnnotationElementValue;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

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
    public AnnotationElementValue read(final ByteCodeReader input) throws IOException {
        return new AnnotationElementValue(annotationReader.read(input));
    }
}
