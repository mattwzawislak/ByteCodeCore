package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.dstore_3;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dstore_3Reader implements Reader<dstore_3> {

    @Override
    public dstore_3 read(final ByteCodeReader input) throws IOException {
        return dstore_3.INSTANCE;
    }
}