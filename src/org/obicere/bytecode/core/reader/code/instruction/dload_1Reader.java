package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultDLoad_1;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dload_1Reader implements Reader<DefaultDLoad_1> {

    @Override
    public DefaultDLoad_1 read(final ByteCodeReader input) throws IOException {
        return DefaultDLoad_1.INSTANCE;
    }
}