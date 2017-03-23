package org.obicere.bytecode.core.reader.annotation;

import org.javacore.Identifier;
import org.javacore.JCClass;
import org.javacore.JavaCore;
import org.javacore.annotation.Annotation;
import org.javacore.annotation.ElementValuePair;
import org.javacore.constant.ConstantUtf8;
import org.obicere.bytecode.core.objects.annotation.DefaultAnnotation;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class AnnotationReader implements Reader<Annotation> {

    @Override
    public Annotation read(final ByteCodeReader input) throws IOException {
        final ConstantUtf8 typeName = input.readConstant();
        final JCClass type = JavaCore.getClass(typeName.getValue());
        final int numElementValuePairs = input.readUnsignedShort();
        final ElementValuePair[] pairs = new ElementValuePair[numElementValuePairs];

        for (int i = 0; i < numElementValuePairs; i++) {
            pairs[i] = input.read(Identifier.ELEMENT_VALUE_PAIR);
        }
        return new DefaultAnnotation(type, pairs);
    }
}
