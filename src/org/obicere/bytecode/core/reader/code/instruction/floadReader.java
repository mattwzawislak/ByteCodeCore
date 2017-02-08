package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultFLoad;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class floadReader implements Reader<DefaultFLoad> {

    @Override
    public DefaultFLoad read(final ByteCodeReader input) throws IOException {
       return new DefaultFLoad(input.readUnsignedByte());
    }
}