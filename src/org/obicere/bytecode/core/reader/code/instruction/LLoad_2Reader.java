package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.LLoad_2;
import org.obicere.bytecode.core.objects.code.instruction.DefaultLLoad_2;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LLoad_2Reader implements Reader<LLoad_2> {

    @Override
    public LLoad_2 read(final ByteCodeReader input) throws IOException {
        return DefaultLLoad_2.INSTANCE;
    }
}