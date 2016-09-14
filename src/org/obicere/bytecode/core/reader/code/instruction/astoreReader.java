package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.astore;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class astoreReader implements Reader<astore> {

    @Override
    public astore read(final ByteCodeReader input) throws IOException {
        return new astore(input.readUnsignedByte());
    }
}
