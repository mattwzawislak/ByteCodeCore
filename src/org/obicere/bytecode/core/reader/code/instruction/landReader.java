package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultLAnd;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class landReader implements Reader<DefaultLAnd> {

    @Override
    public DefaultLAnd read(final ByteCodeReader input) throws IOException {
        return DefaultLAnd.INSTANCE;
    }
}