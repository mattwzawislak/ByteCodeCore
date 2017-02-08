package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultI2S;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class i2sReader implements Reader<DefaultI2S> {

    @Override
    public DefaultI2S read(final ByteCodeReader input) throws IOException {
        return DefaultI2S.INSTANCE;
    }
}