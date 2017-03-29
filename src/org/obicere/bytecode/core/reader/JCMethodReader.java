package org.obicere.bytecode.core.reader;

import org.javacore.JCMethod;
import org.javacore.attribute.AttributeSet;
import org.javacore.constant.ConstantUtf8;
import org.obicere.bytecode.core.objects.DefaultJCMethod;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class JCMethodReader implements Reader<JCMethod> {

    @Override
    public DefaultJCMethod read(final ByteCodeReader input) throws IOException {
        final int accessFlags = input.readUnsignedShort();
        final ConstantUtf8 nameConstant = input.readConstant();
        final ConstantUtf8 descriptorConstant = input.readConstant();

        final String name = nameConstant.getValue();
        final String descriptor = descriptorConstant.getValue();

        final AttributeSet attributes = input.readAttributeSet();

        return new DefaultJCMethod(accessFlags, name, descriptor, attributes);
    }
}
