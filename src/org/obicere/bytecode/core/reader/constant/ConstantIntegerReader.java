package org.obicere.bytecode.core.reader.constant;

import org.javacore.constant.ConstantInteger;
import org.obicere.bytecode.core.objects.constant.DefaultConstantInteger;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ConstantIntegerReader implements Reader<ConstantInteger> {
    @Override
    public ConstantInteger read(final ByteCodeReader input) throws IOException {
        return new DefaultConstantInteger(input.readInt());
    }
}
