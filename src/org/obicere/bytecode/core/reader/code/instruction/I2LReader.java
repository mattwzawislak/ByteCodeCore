package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.I2L;
import org.obicere.bytecode.core.objects.code.instruction.DefaultI2L;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class I2LReader implements Reader<I2L> {

    @Override
    public I2L read(final ByteCodeReader input) throws IOException {
        return DefaultI2L.INSTANCE;
    }
}