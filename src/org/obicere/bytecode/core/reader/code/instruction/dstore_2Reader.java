package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultDStore_2;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dstore_2Reader implements Reader<DefaultDStore_2> {

    @Override
    public DefaultDStore_2 read(final ByteCodeReader input) throws IOException {
        return DefaultDStore_2.INSTANCE;
    }
}