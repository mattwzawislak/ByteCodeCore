package org.obicere.bytecode.core.reader.attribute;

import org.javacore.Identifier;
import org.javacore.attribute.Attribute;
import org.javacore.attribute.Attributes;
import org.javacore.constant.ConstantUtf8;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class AttributeReader implements Reader<Attribute> {

    @Override
    public Attribute read(final ByteCodeReader input) throws IOException {
        input.mark(2);
        final ConstantUtf8 attributeNameConstant = input.readConstant();
        final String attributeName = attributeNameConstant.getValue();
        final Identifier identifier = Attributes.of(attributeName);
        input.reset();

        return input.read(identifier);
    }
}
