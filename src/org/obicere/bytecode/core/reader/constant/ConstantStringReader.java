package org.obicere.bytecode.core.reader.constant;

import org.javacore.constant.ConstantString;
import org.obicere.bytecode.core.objects.constant.DefaultConstantString;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ConstantStringReader implements Reader<ConstantString> {
    @Override
    public ConstantString read(final ByteCodeReader input) throws IOException {
        return new DefaultConstantString(input.getConstantPool(), input.readUnsignedShort());
    }
}
