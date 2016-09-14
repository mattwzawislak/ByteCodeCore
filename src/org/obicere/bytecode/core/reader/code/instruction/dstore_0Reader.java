package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.dstore_0;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dstore_0Reader implements Reader<dstore_0> {

    @Override
    public dstore_0 read(final ByteCodeReader input) throws IOException {
        return dstore_0.INSTANCE;
    }
}