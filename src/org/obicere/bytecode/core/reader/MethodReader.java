package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.Attribute;
import org.obicere.bytecode.core.objects.Method;
import org.obicere.bytecode.core.util.IndexedDataInputStream;

import java.io.IOException;

/**
 * @author Obicere
 */
public class MethodReader implements Reader<Method> {

    private final AttributeReader attributeReader;

    public MethodReader(final AttributeReader attributeReader) {
        this.attributeReader = attributeReader;
    }

    @Override
    public Method read(final IndexedDataInputStream input) throws IOException {
        final int startIndex = input.getLogicalIndex();

        final int accessFlags = input.readUnsignedShort();
        final int nameIndex = input.readUnsignedShort();
        final int descriptorIndex = input.readUnsignedShort();

        final int attributesCount = input.readUnsignedShort();
        final Attribute[] attributes = new Attribute[attributesCount];
        for (int i = 0; i < attributesCount; i++) {
            attributes[i] = attributeReader.read(input);
        }
        final Method method = new Method(accessFlags, nameIndex, descriptorIndex, attributes);
        final int endIndex = input.getLogicalIndex();

        method.setBounds(startIndex, endIndex);

        return method;
    }
}
