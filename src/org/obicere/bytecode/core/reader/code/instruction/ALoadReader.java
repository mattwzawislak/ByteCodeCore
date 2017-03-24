package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.ALoad;
import org.obicere.bytecode.core.objects.code.instruction.DefaultALoad;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ALoadReader implements Reader<ALoad> {
    @Override
    public ALoad read(final ByteCodeReader input) throws IOException {
        return new DefaultALoad(input.readUnsignedByte());
    }
}
