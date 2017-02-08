package org.obicere.bytecode.core.reader.attribute;

import org.obicere.bytecode.core.objects.attribute.AnnotationDefaultAttribute;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.reader.annotation.ElementValueReader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class AnnotationDefaultAttributeReader implements Reader<AnnotationDefaultAttribute> {

    @Override
    public AnnotationDefaultAttribute read(final ByteCodeReader input) throws IOException {
        // read length and discard
        input.readInt();
        return new AnnotationDefaultAttribute(elementValue.read(input));
    }
}
