package org.obicere.bytecode.core.reader.annotation;

import org.javacore.Identifier;
import org.javacore.JCClass;
import org.javacore.JavaCore;
import org.javacore.annotation.ElementValuePair;
import org.javacore.annotation.TypeAnnotation;
import org.javacore.annotation.path.Path;
import org.javacore.annotation.target.Target;
import org.javacore.constant.ConstantUtf8;
import org.obicere.bytecode.core.objects.annotation.DefaultTypeAnnotation;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class TypeAnnotationReader implements Reader<TypeAnnotation> {

    @Override
    public TypeAnnotation read(final ByteCodeReader input) throws IOException {
        final Target targetInfo = input.read(Identifier.TARGET);

        final int pathLength = input.readUnsignedByte();
        final Path[] typePath = new Path[pathLength];
        for(int i = 0; i < pathLength; i++) {
            typePath[i] = input.read(Identifier.PATH);
        }
        final ConstantUtf8 typeName = input.readConstant();
        final JCClass type = JavaCore.getClass(typeName.getValue());

        final int numElementValuePairs = input.readUnsignedShort();
        final ElementValuePair[] elementValuePairs = new ElementValuePair[numElementValuePairs];
        for (int i = 0; i < numElementValuePairs; i++) {
            elementValuePairs[i] = input.read(Identifier.ELEMENT_VALUE_PAIR);
        }
        return new DefaultTypeAnnotation(targetInfo.getType(), targetInfo, typePath, type, elementValuePairs);
    }
}
