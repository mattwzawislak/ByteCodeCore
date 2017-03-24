package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.I2C;
import org.obicere.bytecode.core.objects.code.instruction.DefaultI2C;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class I2CReader implements Reader<I2C> {

    @Override
    public I2C read(final ByteCodeReader input) throws IOException {
        return DefaultI2C.INSTANCE;
    }
}