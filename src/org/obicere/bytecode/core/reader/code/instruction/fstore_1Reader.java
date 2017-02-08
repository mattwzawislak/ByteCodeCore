package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultFStore_1;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fstore_1Reader implements Reader<DefaultFStore_1> {

    @Override
    public DefaultFStore_1 read(final ByteCodeReader input) throws IOException {
        return DefaultFStore_1.INSTANCE;
    }
}