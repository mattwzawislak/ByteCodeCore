package org.obicere.bytecode.core.reader.attribute;

import org.javacore.Identifier;
import org.javacore.annotation.Annotation;
import org.javacore.attribute.RuntimeVisibleAnnotationsAttribute;
import org.obicere.bytecode.core.objects.attribute.DefaultRuntimeVisibleAnnotationsAttribute;
import org.obicere.bytecode.core.reader.Reader;
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
            annotations[i] = input.read(Identifier.ANNOTATION);
        }
        return new DefaultRuntimeVisibleAnnotationsAttribute(annotations);
    }
}
