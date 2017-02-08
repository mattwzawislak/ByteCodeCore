package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultALoad_1;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class aload_1Reader implements Reader<DefaultALoad_1> {

    @Override
    public DefaultALoad_1 read(final ByteCodeReader input) throws IOException {
        return DefaultALoad_1.INSTANCE;
    }
}