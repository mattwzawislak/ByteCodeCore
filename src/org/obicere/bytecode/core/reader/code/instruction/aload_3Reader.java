package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultALoad_3;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class aload_3Reader implements Reader<DefaultALoad_3> {

    @Override
    public DefaultALoad_3 read(final ByteCodeReader input) throws IOException {
        return DefaultALoad_3.INSTANCE;
    }
}