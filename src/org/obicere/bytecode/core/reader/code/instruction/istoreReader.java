package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.istore;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class istoreReader implements Reader<istore> {

    @Override
    public istore read(final ByteCodeReader input) throws IOException {
        return new istore(input.readUnsignedByte());
    }
}