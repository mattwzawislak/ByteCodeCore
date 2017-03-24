package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.LLoad_3;
import org.obicere.bytecode.core.objects.code.instruction.DefaultLLoad_3;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LLoad_3Reader implements Reader<LLoad_3> {

    @Override
    public LLoad_3 read(final ByteCodeReader input) throws IOException {
        return DefaultLLoad_3.INSTANCE;
    }
}