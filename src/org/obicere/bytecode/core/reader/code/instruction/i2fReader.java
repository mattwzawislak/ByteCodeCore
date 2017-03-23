package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.I2F;
import org.obicere.bytecode.core.objects.code.instruction.DefaultI2F;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class I2FReader implements Reader<I2F> {

    @Override
    public I2F read(final ByteCodeReader input) throws IOException {
        return DefaultI2F.INSTANCE;
    }
}