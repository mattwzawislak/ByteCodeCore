package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.I2S;
import org.obicere.bytecode.core.objects.code.instruction.DefaultI2S;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class I2SReader implements Reader<I2S> {

    @Override
    public I2S read(final ByteCodeReader input) throws IOException {
        return DefaultI2S.INSTANCE;
    }
}