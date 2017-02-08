package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultDLoad_2;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dload_2Reader implements Reader<DefaultDLoad_2> {

    @Override
    public DefaultDLoad_2 read(final ByteCodeReader input) throws IOException {
        return DefaultDLoad_2.INSTANCE;
    }
}