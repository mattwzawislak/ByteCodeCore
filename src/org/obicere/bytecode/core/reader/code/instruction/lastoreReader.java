package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.lastore;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lastoreReader implements Reader<lastore> {

    @Override
    public lastore read(final ByteCodeReader input) throws IOException {
        return lastore.INSTANCE;
    }
}