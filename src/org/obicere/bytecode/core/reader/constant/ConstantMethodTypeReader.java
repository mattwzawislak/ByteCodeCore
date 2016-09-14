package org.obicere.bytecode.core.reader.constant;

import org.obicere.bytecode.core.objects.constant.ConstantMethodType;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ConstantMethodTypeReader implements Reader<ConstantMethodType> {
    @Override
    public ConstantMethodType read(final ByteCodeReader input) throws IOException {
        return new ConstantMethodType(input.getConstantPool(), input.readUnsignedShort());
    }
}
