package org.obicere.bytecode.core.reader.constant;

import org.javacore.constant.ConstantClass;
import org.obicere.bytecode.core.objects.constant.DefaultConstantClass;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ConstantClassReader implements Reader<ConstantClass> {
    @Override
    public ConstantClass read(final ByteCodeReader input) throws IOException {
        return new DefaultConstantClass(input.getConstantPool(), input.readUnsignedShort());
    }
}
