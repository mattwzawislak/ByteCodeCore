package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultLLoad_1;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lload_1Reader implements Reader<DefaultLLoad_1> {

    @Override
    public DefaultLLoad_1 read(final ByteCodeReader input) throws IOException {
        return DefaultLLoad_1.INSTANCE;
    }
}