package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.ALoad_3;
import org.obicere.bytecode.core.objects.code.instruction.DefaultALoad_3;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ALoad_3Reader implements Reader<ALoad_3> {

    @Override
    public ALoad_3 read(final ByteCodeReader input) throws IOException {
        return DefaultALoad_3.INSTANCE;
    }
}