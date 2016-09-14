package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.lload_3;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lload_3Reader implements Reader<lload_3> {

    @Override
    public lload_3 read(final ByteCodeReader input) throws IOException {
        return lload_3.INSTANCE;
    }
}