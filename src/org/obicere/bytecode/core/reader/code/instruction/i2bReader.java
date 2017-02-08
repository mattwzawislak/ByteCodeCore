package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultI2B;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class i2bReader implements Reader<DefaultI2B> {

    @Override
    public DefaultI2B read(final ByteCodeReader input) throws IOException {
        return DefaultI2B.INSTANCE;
    }
}