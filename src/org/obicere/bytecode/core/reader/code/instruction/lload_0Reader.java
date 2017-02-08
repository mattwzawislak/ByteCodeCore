package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultLLoad_0;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lload_0Reader implements Reader<DefaultLLoad_0> {

    @Override
    public DefaultLLoad_0 read(final ByteCodeReader input) throws IOException {
        return DefaultLLoad_0.INSTANCE;
    }
}