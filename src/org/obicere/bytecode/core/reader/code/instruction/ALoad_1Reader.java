package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.ALoad_1;
import org.obicere.bytecode.core.objects.code.instruction.DefaultALoad_1;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ALoad_1Reader implements Reader<ALoad_1> {

    @Override
    public ALoad_1 read(final ByteCodeReader input) throws IOException {
        return DefaultALoad_1.INSTANCE;
    }
}