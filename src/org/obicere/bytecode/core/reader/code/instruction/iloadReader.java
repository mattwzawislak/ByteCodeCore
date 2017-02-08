package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultILoad;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iloadReader implements Reader<DefaultILoad> {

    @Override
    public DefaultILoad read(final ByteCodeReader input) throws IOException {
        return new DefaultILoad(input.readUnsignedByte());
    }
}