package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.lload_2;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lload_2Reader implements Reader<lload_2> {

    @Override
    public lload_2 read(final ByteCodeReader input) throws IOException {
        return lload_2.INSTANCE;
    }
}