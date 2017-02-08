package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultLStore_2;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lstore_2Reader implements Reader<DefaultLStore_2> {

    @Override
    public DefaultLStore_2 read(final ByteCodeReader input) throws IOException {
        return DefaultLStore_2.INSTANCE;
    }
}