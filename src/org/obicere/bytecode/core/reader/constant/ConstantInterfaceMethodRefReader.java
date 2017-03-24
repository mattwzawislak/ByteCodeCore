package org.obicere.bytecode.core.reader.constant;

import org.javacore.constant.ConstantInterfaceMethodRef;
import org.obicere.bytecode.core.objects.constant.DefaultConstantInterfaceMethodRef;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ConstantInterfaceMethodRefReader implements Reader<ConstantInterfaceMethodRef> {
    @Override
    public ConstantInterfaceMethodRef read(final ByteCodeReader input) throws IOException {
        return new DefaultConstantInterfaceMethodRef(input.getConstantPool(), input.readUnsignedShort(), input.readUnsignedShort());
    }
}
