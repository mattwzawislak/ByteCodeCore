package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultLStore_0;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lstore_0Reader implements Reader<DefaultLStore_0> {

    @Override
    public DefaultLStore_0 read(final ByteCodeReader input) throws IOException {
        return DefaultLStore_0.INSTANCE;
    }
}