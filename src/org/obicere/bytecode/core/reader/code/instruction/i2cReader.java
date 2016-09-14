package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.i2c;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class i2cReader implements Reader<i2c> {

    @Override
    public i2c read(final ByteCodeReader input) throws IOException {
        return i2c.INSTANCE;
    }
}