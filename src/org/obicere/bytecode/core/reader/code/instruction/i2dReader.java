package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.I2D;
import org.obicere.bytecode.core.objects.code.instruction.DefaultI2D;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class I2DReader implements Reader<I2D> {

    @Override
    public I2D read(final ByteCodeReader input) throws IOException {
        return DefaultI2D.INSTANCE;
    }
}