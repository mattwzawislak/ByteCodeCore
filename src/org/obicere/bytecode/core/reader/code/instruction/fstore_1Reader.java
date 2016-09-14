package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.fstore_1;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fstore_1Reader implements Reader<fstore_1> {

    @Override
    public fstore_1 read(final ByteCodeReader input) throws IOException {
        return fstore_1.INSTANCE;
    }
}