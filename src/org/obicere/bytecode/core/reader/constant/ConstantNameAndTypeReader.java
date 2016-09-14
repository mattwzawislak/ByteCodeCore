package org.obicere.bytecode.core.reader.constant;

import org.obicere.bytecode.core.objects.constant.ConstantNameAndType;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ConstantNameAndTypeReader implements Reader<ConstantNameAndType> {
    @Override
    public ConstantNameAndType read(final ByteCodeReader input) throws IOException {
        return new ConstantNameAndType(input.getConstantPool(), input.readUnsignedShort(), input.readUnsignedShort());
    }
}
