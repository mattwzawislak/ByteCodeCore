package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultALoad_2;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class aload_2Reader implements Reader<DefaultALoad_2> {

    @Override
    public DefaultALoad_2 read(final ByteCodeReader input) throws IOException {
        return DefaultALoad_2.INSTANCE;
    }
}