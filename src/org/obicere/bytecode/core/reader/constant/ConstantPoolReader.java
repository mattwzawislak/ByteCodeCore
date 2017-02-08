package org.obicere.bytecode.core.reader.constant;

import org.obicere.bytecode.core.objects.constant.ConstantPool;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ConstantPoolReader implements Reader<ConstantPool> {

    @Override
    public ConstantPool read(final ByteCodeReader input) throws IOException {
        return new ConstantPool(input);
    }
}
