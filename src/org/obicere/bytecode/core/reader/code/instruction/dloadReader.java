package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.DLoad;
import org.obicere.bytecode.core.objects.code.instruction.DefaultDLoad;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class DLoadReader implements Reader<DLoad> {

    @Override
    public DLoad read(final ByteCodeReader input) throws IOException {
        return new DefaultDLoad(input.readUnsignedByte());
    }
}