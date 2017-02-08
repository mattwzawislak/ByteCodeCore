package org.obicere.bytecode.core.reader.attribute;

import org.obicere.bytecode.core.objects.annotation.Annotation;
import org.obicere.bytecode.core.objects.attribute.RuntimeVisibleAnnotationsAttribute;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.reader.annotation.AnnotationReader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class RuntimeVisibleAnnotationsAttributeReader implements Reader<RuntimeVisibleAnnotationsAttribute> {

    @Override
    public RuntimeVisibleAnnotationsAttribute read(final ByteCodeReader input) throws IOException {
        // read length and discard
        input.readInt();
        final int numAnnotations = input.readUnsignedShort();
        final Annotation[] annotations = new Annotation[numAnnotations];

        for (int i = 0; i < numAnnotations; i++) {
            annotations[i] = annotation.read(input);
        }
        return new RuntimeVisibleAnnotationsAttribute(annotations);
    }
}
