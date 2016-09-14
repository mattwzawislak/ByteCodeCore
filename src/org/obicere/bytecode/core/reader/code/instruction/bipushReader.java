package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.bipush;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class bipushReader implements Reader<bipush> {

    @Override
    public bipush read(final ByteCodeReader input) throws IOException {
        return new bipush(input.readByte());
    }
}
