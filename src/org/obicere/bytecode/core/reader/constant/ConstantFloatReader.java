package org.obicere.bytecode.core.reader.constant;

import org.javacore.constant.ConstantFloat;
import org.obicere.bytecode.core.objects.constant.DefaultConstantFloat;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ConstantFloatReader implements Reader<ConstantFloat> {
    @Override
    public ConstantFloat read(final ByteCodeReader input) throws IOException {
        return new DefaultConstantFloat(input.readFloat());
    }
}
