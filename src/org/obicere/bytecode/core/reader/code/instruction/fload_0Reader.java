package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultFLoad_0;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fload_0Reader implements Reader<DefaultFLoad_0> {

    @Override
    public DefaultFLoad_0 read(final ByteCodeReader input) throws IOException {
        return DefaultFLoad_0.INSTANCE;
    }
}