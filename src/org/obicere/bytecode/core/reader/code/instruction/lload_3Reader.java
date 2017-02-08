package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultLLoad_3;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lload_3Reader implements Reader<DefaultLLoad_3> {

    @Override
    public DefaultLLoad_3 read(final ByteCodeReader input) throws IOException {
        return DefaultLLoad_3.INSTANCE;
    }
}