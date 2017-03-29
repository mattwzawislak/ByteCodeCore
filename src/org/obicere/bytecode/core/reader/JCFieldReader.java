package org.obicere.bytecode.core.reader;

import org.javacore.JCField;
import org.javacore.attribute.AttributeSet;
import org.javacore.constant.ConstantUtf8;
import org.obicere.bytecode.core.objects.DefaultJCField;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class JCFieldReader implements Reader<JCField> {

    @Override
    public JCField read(final ByteCodeReader input) throws IOException {
        final int accessFlags = input.readUnsignedShort();
        final ConstantUtf8 nameConstant = input.readConstant();
        final ConstantUtf8 descriptorConstant = input.readConstant();

        final String name = nameConstant.getValue();
        final String descriptor = descriptorConstant.getValue();

        final AttributeSet attributes = input.readAttributeSet();

        return new DefaultJCField(accessFlags, name, descriptor, attributes);
    }
}
