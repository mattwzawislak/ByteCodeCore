package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultDStore_1;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dstore_1Reader implements Reader<DefaultDStore_1> {

    @Override
    public DefaultDStore_1 read(final ByteCodeReader input) throws IOException {
        return DefaultDStore_1.INSTANCE;
    }
}