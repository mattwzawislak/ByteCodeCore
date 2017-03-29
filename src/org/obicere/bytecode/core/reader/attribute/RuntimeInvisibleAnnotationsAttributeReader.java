package org.obicere.bytecode.core.reader.attribute;

import org.javacore.Identifier;
import org.javacore.annotation.Annotation;
import org.javacore.attribute.RuntimeInvisibleAnnotationsAttribute;
import org.obicere.bytecode.core.objects.attribute.DefaultRuntimeInvisibleAnnotationsAttribute;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class RuntimeInvisibleAnnotationsAttributeReader implements Reader<RuntimeInvisibleAnnotationsAttribute> {

    @Override
    public RuntimeInvisibleAnnotationsAttribute read(final ByteCodeReader input) throws IOException {
        // read name and discard
        input.readShort();
        // read length and discard
        input.readInt();
        final int numAnnotations = input.readUnsignedShort();
        final Annotation[] annotations = new Annotation[numAnnotations];

        for (int i = 0; i < numAnnotations; i++) {
            annotations[i] = input.read(Identifier.ANNOTATION);
        }
        return new DefaultRuntimeInvisibleAnnotationsAttribute(annotations);
    }
}
