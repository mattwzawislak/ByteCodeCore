package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.fstore_3;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fstore_3Reader implements Reader<fstore_3> {

    @Override
    public fstore_3 read(final ByteCodeReader input) throws IOException {
        return fstore_3.INSTANCE;
    }
}