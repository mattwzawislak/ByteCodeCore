package org.obicere.bytecode.core.reader;

import org.obicere.bytecode.core.objects.Method;
import org.obicere.bytecode.core.objects.attribute.AttributeSet;
import org.obicere.bytecode.core.objects.constant.ConstantUtf8;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class MethodReader implements Reader<Method> {

    @Override
    public Method read(final ByteCodeReader input) throws IOException {
        final int accessFlags = input.readUnsignedShort();
        final ConstantUtf8 nameConstant = input.readConstant();
        final ConstantUtf8 descriptorConstant = input.readConstant();

        final String name = nameConstant.getBytes();
        final String descriptor = nameConstant.getBytes();

        final AttributeSet attributeSet = input.readAttributeSet();

        return new Method(accessFlags, name, descriptor, attributeSet);
    }
}
