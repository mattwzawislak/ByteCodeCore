package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.bastore;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class bastoreReader implements Reader<bastore> {

    @Override
    public bastore read(final ByteCodeReader input) throws IOException {
        return bastore.INSTANCE;
    }
}
