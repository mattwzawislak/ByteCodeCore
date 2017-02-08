package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultDLoad_0;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dload_0Reader implements Reader<DefaultDLoad_0> {

    @Override
    public DefaultDLoad_0 read(final ByteCodeReader input) throws IOException {
        return DefaultDLoad_0.INSTANCE;
    }
}