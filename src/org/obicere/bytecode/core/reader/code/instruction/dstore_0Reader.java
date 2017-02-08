package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultDStore_0;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dstore_0Reader implements Reader<DefaultDStore_0> {

    @Override
    public DefaultDStore_0 read(final ByteCodeReader input) throws IOException {
        return DefaultDStore_0.INSTANCE;
    }
}