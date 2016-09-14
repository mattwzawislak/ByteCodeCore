package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.dstore_1;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dstore_1Reader implements Reader<dstore_1> {

    @Override
    public dstore_1 read(final ByteCodeReader input) throws IOException {
        return dstore_1.INSTANCE;
    }
}