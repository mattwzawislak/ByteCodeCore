package org.obicere.bytecode.core.reader.constant;

import org.javacore.constant.ConstantMethodHandle;
import org.obicere.bytecode.core.objects.constant.DefaultConstantMethodHandle;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ConstantMethodHandleReader implements Reader<ConstantMethodHandle> {
    @Override
    public ConstantMethodHandle read(final ByteCodeReader input) throws IOException {
        return new DefaultConstantMethodHandle(input.getConstantPool(), input.readByte(), input.readUnsignedShort());
    }
}
