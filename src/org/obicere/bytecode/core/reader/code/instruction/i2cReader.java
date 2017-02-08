package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultI2C;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class i2cReader implements Reader<DefaultI2C> {

    @Override
    public DefaultI2C read(final ByteCodeReader input) throws IOException {
        return DefaultI2C.INSTANCE;
    }
}