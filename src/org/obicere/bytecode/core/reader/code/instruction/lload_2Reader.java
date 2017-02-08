package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultLLoad_2;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lload_2Reader implements Reader<DefaultLLoad_2> {

    @Override
    public DefaultLLoad_2 read(final ByteCodeReader input) throws IOException {
        return DefaultLLoad_2.INSTANCE;
    }
}