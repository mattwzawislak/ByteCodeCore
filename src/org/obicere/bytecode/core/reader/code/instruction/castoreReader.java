package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.castore;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class castoreReader implements Reader<castore> {

    @Override
    public castore read(final ByteCodeReader input) throws IOException {
        return castore.INSTANCE;
    }
}
