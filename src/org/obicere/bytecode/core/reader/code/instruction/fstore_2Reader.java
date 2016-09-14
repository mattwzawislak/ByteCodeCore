package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.fstore_2;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fstore_2Reader implements Reader<fstore_2> {

    @Override
    public fstore_2 read(final ByteCodeReader input) throws IOException {
        return fstore_2.INSTANCE;
    }
}