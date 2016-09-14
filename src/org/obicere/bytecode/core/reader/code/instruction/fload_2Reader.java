package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.fload_2;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fload_2Reader implements Reader<fload_2> {

    @Override
    public fload_2 read(final ByteCodeReader input) throws IOException {
        return fload_2.INSTANCE;
    }
}