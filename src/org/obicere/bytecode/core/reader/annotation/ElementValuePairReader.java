package org.obicere.bytecode.core.reader.annotation;

import org.javacore.Identifier;
import org.javacore.annotation.ElementValue;
import org.javacore.annotation.ElementValuePair;
import org.javacore.constant.ConstantUtf8;
import org.obicere.bytecode.core.objects.annotation.DefaultElementValuePair;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ElementValuePairReader implements Reader<ElementValuePair> {

    @Override
    public ElementValuePair read(final ByteCodeReader input) throws IOException {
        final ConstantUtf8 nameConstant = input.readConstant();
        final String name = nameConstant.getValue();
        final ElementValue value = input.read(Identifier.ELEMENT_VALUE);
        return new DefaultElementValuePair(name, value);
    }
}
