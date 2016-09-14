package org.obicere.bytecode.core.reader.constant;

import org.obicere.bytecode.core.objects.constant.ConstantInvokeDynamic;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ConstantInvokeDynamicReader implements Reader<ConstantInvokeDynamic> {
    @Override
    public ConstantInvokeDynamic read(final ByteCodeReader input) throws IOException {
        return new ConstantInvokeDynamic(input.getConstantPool(), input.readUnsignedShort(), input.readUnsignedShort());
    }
}
