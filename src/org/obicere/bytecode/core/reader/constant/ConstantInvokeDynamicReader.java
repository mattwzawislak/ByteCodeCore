package org.obicere.bytecode.core.reader.constant;

import org.javacore.constant.ConstantInvokeDynamic;
import org.obicere.bytecode.core.objects.constant.DefaultConstantInvokeDynamic;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ConstantInvokeDynamicReader implements Reader<ConstantInvokeDynamic> {
    @Override
    public ConstantInvokeDynamic read(final ByteCodeReader input) throws IOException {
        return new DefaultConstantInvokeDynamic(input.getConstantPool(), input.readUnsignedShort(), input.readUnsignedShort());
    }
}
