package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.fload_1;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fload_1Reader implements Reader<fload_1> {

    @Override
    public fload_1 read(final ByteCodeReader input) throws IOException {
        return fload_1.INSTANCE;
    }
}