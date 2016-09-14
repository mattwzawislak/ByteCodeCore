package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.lconst_1;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lconst_1Reader implements Reader<lconst_1> {

    @Override
    public lconst_1 read(final ByteCodeReader input) throws IOException {
        return lconst_1.INSTANCE;
    }
}