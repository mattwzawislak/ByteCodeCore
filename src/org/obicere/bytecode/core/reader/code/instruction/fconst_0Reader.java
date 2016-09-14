package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.fconst_0;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fconst_0Reader implements Reader<fconst_0> {

    @Override
    public fconst_0 read(final ByteCodeReader input) throws IOException {
        return fconst_0.INSTANCE;
    }
}