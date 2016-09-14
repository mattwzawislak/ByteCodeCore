package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.lload_1;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lload_1Reader implements Reader<lload_1> {

    @Override
    public lload_1 read(final ByteCodeReader input) throws IOException {
        return lload_1.INSTANCE;
    }
}