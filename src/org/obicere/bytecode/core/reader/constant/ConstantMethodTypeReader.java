package org.obicere.bytecode.core.reader.constant;

import org.javacore.constant.ConstantMethodType;
import org.obicere.bytecode.core.objects.constant.DefaultConstantMethodType;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ConstantMethodTypeReader implements Reader<ConstantMethodType> {
    @Override
    public ConstantMethodType read(final ByteCodeReader input) throws IOException {
        return new DefaultConstantMethodType(input.getConstantPool(), input.readUnsignedShort());
    }
}
