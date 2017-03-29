package org.obicere.bytecode.core.reader.attribute;

import org.javacore.attribute.UnknownAttribute;
import org.javacore.constant.ConstantUtf8;
import org.obicere.bytecode.core.objects.attribute.DefaultUnknownAttribute;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class UnknownAttributeReader implements Reader<UnknownAttribute> {


    @Override
    public UnknownAttribute read(final ByteCodeReader input) throws IOException {
        final ConstantUtf8 constant = input.readConstant();
        final String attributeName = constant.getValue();
        final int length = input.readInt();
        final byte[] bytes = new byte[length];
        if (input.read(bytes) < 0) {
            throw new IOException("Reached end of input reading unknown attribute: " + attributeName);
        }

        return new DefaultUnknownAttribute(attributeName, bytes);
    }
}
