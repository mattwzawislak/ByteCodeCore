package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.iastore;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iastoreReader implements Reader<iastore> {

    @Override
    public iastore read(final ByteCodeReader input) throws IOException {
        return iastore.INSTANCE;
    }
}