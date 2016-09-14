package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.ret;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class retReader implements Reader<ret> {

    @Override
    public ret read(final ByteCodeReader input) throws IOException {
        return new ret(input.readUnsignedByte());
    }
}