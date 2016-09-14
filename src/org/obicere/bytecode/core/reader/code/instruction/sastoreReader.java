package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.sastore;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class sastoreReader implements Reader<sastore> {

    @Override
    public sastore read(final ByteCodeReader input) throws IOException {
        return sastore.INSTANCE;
    }
}