package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.fastore;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fastoreReader implements Reader<fastore> {

    @Override
    public fastore read(final ByteCodeReader input) throws IOException {
        return fastore.INSTANCE;
    }
}