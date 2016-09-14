package org.obicere.bytecode.core.reader.annotation;

import org.obicere.bytecode.core.objects.annotation.Annotation;
import org.obicere.bytecode.core.objects.annotation.ElementValuePair;
import org.obicere.bytecode.core.objects.constant.ConstantUtf8;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.type.Type;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class AnnotationReader implements Reader<Annotation> {

    private final ElementValueReader elementValue;

    public AnnotationReader() {
        this.elementValue = new ElementValueReader(this);
    }

    @Override
    public Annotation read(final ByteCodeReader input) throws IOException {
        final ConstantUtf8 typeName = input.readConstant();
        final Type type = Type.of(typeName.getBytes());
        final int numElementValuePairs = input.readUnsignedShort();
        final ElementValuePair[] pairs = new ElementValuePair[numElementValuePairs];

        for (int i = 0; i < numElementValuePairs; i++) {
            final ConstantUtf8 name = input.readConstant();
            pairs[i] = new ElementValuePair(name.getBytes(), elementValue.read(input));
        }
        return new Annotation(type, pairs);
    }
}
