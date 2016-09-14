package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.dastore;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dastoreReader implements Reader<dastore> {

    @Override
    public dastore read(final ByteCodeReader input) throws IOException {
        return dastore.INSTANCE;
    }
}