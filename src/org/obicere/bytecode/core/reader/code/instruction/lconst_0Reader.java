package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.lconst_0;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lconst_0Reader implements Reader<lconst_0> {

    @Override
    public lconst_0 read(final ByteCodeReader input) throws IOException {
        return lconst_0.INSTANCE;
    }
}