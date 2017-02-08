package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultALoad_0;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class aload_0Reader implements Reader<DefaultALoad_0> {

    @Override
    public DefaultALoad_0 read(final ByteCodeReader input) throws IOException {
        return DefaultALoad_0.INSTANCE;
    }
}
