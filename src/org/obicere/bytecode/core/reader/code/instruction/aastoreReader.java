package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.aastore;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class aastoreReader implements Reader<aastore> {

    @Override
    public aastore read(final ByteCodeReader input) throws IOException {
        return aastore.INSTANCE;
    }
}
