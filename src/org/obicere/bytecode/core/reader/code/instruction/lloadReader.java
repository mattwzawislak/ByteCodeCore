package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.LLoad;
import org.obicere.bytecode.core.objects.code.instruction.DefaultLLoad;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LLoadReader implements Reader<LLoad> {

    @Override
    public LLoad read(final ByteCodeReader input) throws IOException {
        return new DefaultLLoad(input.readUnsignedByte());
    }
}