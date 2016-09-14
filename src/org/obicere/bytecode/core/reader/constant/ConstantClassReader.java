package org.obicere.bytecode.core.reader.constant;

import org.obicere.bytecode.core.objects.constant.ConstantClass;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ConstantClassReader implements Reader<ConstantClass> {
    @Override
    public ConstantClass read(final ByteCodeReader input) throws IOException {
        return new ConstantClass(input.getConstantPool(), input.readUnsignedShort());
    }
}
