package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultI2F;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class i2fReader implements Reader<DefaultI2F> {

    @Override
    public DefaultI2F read(final ByteCodeReader input) throws IOException {
        return DefaultI2F.INSTANCE;
    }
}