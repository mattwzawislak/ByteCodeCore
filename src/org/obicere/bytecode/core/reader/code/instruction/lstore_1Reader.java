package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultLStore_1;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lstore_1Reader implements Reader<DefaultLStore_1> {

    @Override
    public DefaultLStore_1 read(final ByteCodeReader input) throws IOException {
        return DefaultLStore_1.INSTANCE;
    }
}