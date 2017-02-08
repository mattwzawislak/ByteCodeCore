package org.obicere.bytecode.core.reader.constant;

import org.obicere.bytecode.core.objects.constant.DefaultConstantFieldRef;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ConstantFieldRefReader implements Reader<DefaultConstantFieldRef> {
    @Override
    public DefaultConstantFieldRef read(final ByteCodeReader input) throws IOException {
        return new DefaultConstantFieldRef(input.getConstantPool(), input.readUnsignedShort(), input.readUnsignedShort());
    }
}
