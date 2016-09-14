package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.lload;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lloadReader implements Reader<lload> {

    @Override
    public lload read(final ByteCodeReader input) throws IOException {
        return new lload(input.readUnsignedByte());
    }
}