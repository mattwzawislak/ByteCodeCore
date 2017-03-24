package org.obicere.bytecode.core.reader.constant;

import org.javacore.constant.ConstantLong;
import org.obicere.bytecode.core.objects.constant.DefaultConstantLong;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ConstantLongReader implements Reader<ConstantLong> {
    @Override
    public ConstantLong read(final ByteCodeReader input) throws IOException {
        return new DefaultConstantLong(input.readLong());
    }
}
