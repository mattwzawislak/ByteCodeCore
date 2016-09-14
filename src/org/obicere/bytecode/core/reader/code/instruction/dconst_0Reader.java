package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.dconst_0;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dconst_0Reader implements Reader<dconst_0> {

    @Override
    public dconst_0 read(final ByteCodeReader input) throws IOException {
        return dconst_0.INSTANCE;
    }
}