package org.obicere.bytecode.core.reader.constant;

import org.obicere.bytecode.core.objects.constant.ConstantFieldRef;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ConstantFieldRefReader implements Reader<ConstantFieldRef> {
    @Override
    public ConstantFieldRef read(final ByteCodeReader input) throws IOException {
        return new ConstantFieldRef(input.getConstantPool(), input.readUnsignedShort(), input.readUnsignedShort());
    }
}
