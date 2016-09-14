package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.laload;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class laloadReader implements Reader<laload> {

    @Override
    public laload read(final ByteCodeReader input) throws IOException {
        return laload.INSTANCE;
    }
}