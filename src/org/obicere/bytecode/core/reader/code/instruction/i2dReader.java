package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultI2D;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class i2dReader implements Reader<DefaultI2D> {

    @Override
    public DefaultI2D read(final ByteCodeReader input) throws IOException {
        return DefaultI2D.INSTANCE;
    }
}