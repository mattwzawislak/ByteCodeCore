package org.obicere.bytecode.core.reader.annotation;

import org.javacore.Identifier;
import org.obicere.bytecode.core.objects.annotation.AnnotationElementValue;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class AnnotationElementValueReader implements Reader<AnnotationElementValue> {

    @Override
    public AnnotationElementValue read(final ByteCodeReader input) throws IOException {
        return new AnnotationElementValue(input.read(Identifier.ANNOTATION));
    }
}
