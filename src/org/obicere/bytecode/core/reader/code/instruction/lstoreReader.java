package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.lstore;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lstoreReader implements Reader<lstore> {

    @Override
    public lstore read(final ByteCodeReader input) throws IOException {
        return new lstore(input.readUnsignedByte());
    }
}