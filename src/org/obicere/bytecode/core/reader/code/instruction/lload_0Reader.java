package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.lload_0;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lload_0Reader implements Reader<lload_0> {

    @Override
    public lload_0 read(final ByteCodeReader input) throws IOException {
        return lload_0.INSTANCE;
    }
}