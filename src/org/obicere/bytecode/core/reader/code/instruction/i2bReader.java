package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.I2B;
import org.obicere.bytecode.core.objects.code.instruction.DefaultI2B;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class I2BReader implements Reader<I2B> {

    @Override
    public I2B read(final ByteCodeReader input) throws IOException {
        return DefaultI2B.INSTANCE;
    }
}