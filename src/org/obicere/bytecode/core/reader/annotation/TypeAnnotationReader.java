package org.obicere.bytecode.core.reader.annotation;

import org.obicere.bytecode.core.objects.annotation.ElementValue;
import org.obicere.bytecode.core.objects.annotation.ElementValuePair;
import org.obicere.bytecode.core.objects.annotation.TypeAnnotation;
import org.obicere.bytecode.core.objects.annotation.path.TypePath;
import org.obicere.bytecode.core.objects.annotation.target.Target;
import org.obicere.bytecode.core.objects.constant.ConstantUtf8;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.reader.annotation.path.TypePathReader;
import org.obicere.bytecode.core.reader.annotation.target.TargetReader;
import org.obicere.bytecode.core.type.Type;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class TypeAnnotationReader implements Reader<TypeAnnotation> {

    private final TargetReader target = new TargetReader();

    private final TypePathReader typePath = new TypePathReader();

    private final ElementValueReader elementValue;

    public TypeAnnotationReader(final ElementValueReader elementValue) {
        this.elementValue = elementValue;
    }

    @Override
    public TypeAnnotation read(final ByteCodeReader input) throws IOException {
        final Target targetInfo = target.read(input);
        final TypePath path = typePath.read(input);
        final ConstantUtf8 typeName = input.readConstant();
        final Type type = Type.of(typeName.getBytes());
        final int numElementValuePairs = input.readUnsignedShort();

        final ElementValuePair[] elementValuePairs = new ElementValuePair[numElementValuePairs];
        for (int i = 0; i < numElementValuePairs; i++) {
            final ConstantUtf8 name = input.readConstant();
            final ElementValue value = elementValue.read(input);

            elementValuePairs[i] = new ElementValuePair(name.getBytes(), value);
        }
        return new TypeAnnotation(targetInfo.getTargetType(), targetInfo, path, type, elementValuePairs);
    }
}
