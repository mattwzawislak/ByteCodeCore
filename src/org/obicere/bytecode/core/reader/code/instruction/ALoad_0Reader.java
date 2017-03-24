package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.ALoad_0;
import org.obicere.bytecode.core.objects.code.instruction.DefaultALoad_0;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ALoad_0Reader implements Reader<ALoad_0> {

    @Override
    public ALoad_0 read(final ByteCodeReader input) throws IOException {
        return DefaultALoad_0.INSTANCE;
    }
}
