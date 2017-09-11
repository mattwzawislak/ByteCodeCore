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
        final int index = input.peekShort();
        final ConstantUtf8 attributeNameConstant = (ConstantUtf8) input.getConstantPool().get(index);
        final String attributeName = attributeNameConstant.getValue();
        final Identifier identifier = Attributes.of(attributeName);

        return input.read(identifier);
    }
}
