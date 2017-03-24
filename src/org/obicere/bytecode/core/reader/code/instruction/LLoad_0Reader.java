package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.LLoad_0;
import org.obicere.bytecode.core.objects.code.instruction.DefaultLLoad_0;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LLoad_0Reader implements Reader<LLoad_0> {

    @Override
    public LLoad_0 read(final ByteCodeReader input) throws IOException {
        return DefaultLLoad_0.INSTANCE;
    }
}