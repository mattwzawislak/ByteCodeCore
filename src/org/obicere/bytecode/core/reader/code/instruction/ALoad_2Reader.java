package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.ALoad_2;
import org.obicere.bytecode.core.objects.code.instruction.DefaultALoad_2;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ALoad_2Reader implements Reader<ALoad_2> {

    @Override
    public ALoad_2 read(final ByteCodeReader input) throws IOException {
        return DefaultALoad_2.INSTANCE;
    }
}