package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.dconst_1;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dconst_1Reader implements Reader<dconst_1> {

    @Override
    public dconst_1 read(final ByteCodeReader input) throws IOException {
        return dconst_1.INSTANCE;
    }
}