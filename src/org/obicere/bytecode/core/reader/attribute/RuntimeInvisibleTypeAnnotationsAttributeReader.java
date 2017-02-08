package org.obicere.bytecode.core.reader.attribute;

import org.obicere.bytecode.core.objects.annotation.TypeAnnotation;
import org.obicere.bytecode.core.objects.attribute.RuntimeInvisibleTypeAnnotationsAttribute;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.reader.annotation.TypeAnnotationReader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class RuntimeInvisibleTypeAnnotationsAttributeReader implements Reader<RuntimeInvisibleTypeAnnotationsAttribute> {

    @Override
    public RuntimeInvisibleTypeAnnotationsAttribute read(final ByteCodeReader input) throws IOException {
        // read length and discard
        input.readInt();
        final int numAnnotations = input.readUnsignedShort();
        final TypeAnnotation[] annotations = new TypeAnnotation[numAnnotations];

        for (int i = 0; i < numAnnotations; i++) {
            annotations[i] = annotation.read(input);
        }
        return new RuntimeInvisibleTypeAnnotationsAttribute(annotations);
    }
}
