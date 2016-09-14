package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.fstore_0;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fstore_0Reader implements Reader<fstore_0> {

    @Override
    public fstore_0 read(final ByteCodeReader input) throws IOException {
        return fstore_0.INSTANCE;
    }
}