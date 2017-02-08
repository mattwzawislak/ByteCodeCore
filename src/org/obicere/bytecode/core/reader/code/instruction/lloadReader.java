package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultLLoad;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lloadReader implements Reader<DefaultLLoad> {

    @Override
    public DefaultLLoad read(final ByteCodeReader input) throws IOException {
        return new DefaultLLoad(input.readUnsignedByte());
    }
}