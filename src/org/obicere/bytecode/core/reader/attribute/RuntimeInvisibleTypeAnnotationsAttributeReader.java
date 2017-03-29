package org.obicere.bytecode.core.reader.attribute;

import org.javacore.Identifier;
import org.javacore.annotation.TypeAnnotation;
import org.javacore.attribute.RuntimeInvisibleTypeAnnotationsAttribute;
import org.obicere.bytecode.core.objects.attribute.DefaultRuntimeInvisibleTypeAnnotationsAttribute;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class RuntimeInvisibleTypeAnnotationsAttributeReader implements Reader<RuntimeInvisibleTypeAnnotationsAttribute> {

    @Override
    public RuntimeInvisibleTypeAnnotationsAttribute read(final ByteCodeReader input) throws IOException {
        // read name and discard
        input.readShort();
        // read length and discard
        input.readInt();
        final int numAnnotations = input.readUnsignedShort();
        final TypeAnnotation[] annotations = new TypeAnnotation[numAnnotations];

        for (int i = 0; i < numAnnotations; i++) {
            annotations[i] = input.read(Identifier.TYPE_ANNOTATION);
        }
        return new DefaultRuntimeInvisibleTypeAnnotationsAttribute(annotations);
    }
}
