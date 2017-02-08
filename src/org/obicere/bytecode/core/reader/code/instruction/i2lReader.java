package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultI2L;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class i2lReader implements Reader<DefaultI2L> {

    @Override
    public DefaultI2L read(final ByteCodeReader input) throws IOException {
        return DefaultI2L.INSTANCE;
    }
}