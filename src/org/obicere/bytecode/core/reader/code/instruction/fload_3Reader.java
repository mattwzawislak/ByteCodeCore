package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultFLoad_3;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fload_3Reader implements Reader<DefaultFLoad_3> {

    @Override
    public DefaultFLoad_3 read(final ByteCodeReader input) throws IOException {
        return DefaultFLoad_3.INSTANCE;
    }
}