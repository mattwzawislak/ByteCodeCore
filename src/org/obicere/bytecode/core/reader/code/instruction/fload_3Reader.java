package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.fload_3;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fload_3Reader implements Reader<fload_3> {

    @Override
    public fload_3 read(final ByteCodeReader input) throws IOException {
        return fload_3.INSTANCE;
    }
}