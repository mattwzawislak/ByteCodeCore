package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.Field;
import org.obicere.bytecode.core.objects.attribute.Attribute;
import org.obicere.bytecode.core.objects.constant.ConstantUtf8;
import org.obicere.bytecode.core.reader.attribute.AttributeReader;
import org.obicere.bytecode.core.type.Type;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class FieldReader implements Reader<Field> {

    private final AttributeReader attributeReader;

    public FieldReader(final AttributeReader attributeReader) {
        this.attributeReader = attributeReader;
    }

    @Override
    public Field read(final ByteCodeReader input) throws IOException {
        final int accessFlags = input.readUnsignedShort();
        final ConstantUtf8 nameConstant = input.readConstant();
        final ConstantUtf8 descriptorConstant = input.readConstant();

        final String name = nameConstant.getBytes();
        final String descriptor = descriptorConstant.getBytes();
        final Type type = Type.of(descriptor);

        // todo remove
        final int attributesCount = input.readUnsignedShort();
        final Attribute[] attributes = new Attribute[attributesCount];

        for (int i = 0; i < attributesCount; i++) {
            attributes[i] = attributeReader.read(input);
        }

        return new Field(accessFlags, name, type, attributes);
    }
}
