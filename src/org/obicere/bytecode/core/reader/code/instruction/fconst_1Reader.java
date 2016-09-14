package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.fconst_1;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fconst_1Reader implements Reader<fconst_1> {

    @Override
    public fconst_1 read(final ByteCodeReader input) throws IOException {
        return fconst_1.INSTANCE;
    }
}