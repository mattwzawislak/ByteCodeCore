package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.lor;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lorReader implements Reader<lor> {

    @Override
    public lor read(final ByteCodeReader input) throws IOException {
        return lor.INSTANCE;
    }
}