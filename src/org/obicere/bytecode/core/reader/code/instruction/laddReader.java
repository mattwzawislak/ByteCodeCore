package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.ladd;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class laddReader implements Reader<ladd> {

    @Override
    public ladd read(final ByteCodeReader input) throws IOException {
        return ladd.INSTANCE;
    }
}