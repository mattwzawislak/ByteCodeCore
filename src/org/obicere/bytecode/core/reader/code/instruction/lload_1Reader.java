package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.LLoad_1;
import org.obicere.bytecode.core.objects.code.instruction.DefaultLLoad_1;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LLoad_1Reader implements Reader<LLoad_1> {

    @Override
    public LLoad_1 read(final ByteCodeReader input) throws IOException {
        return DefaultLLoad_1.INSTANCE;
    }
}