package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultLStore_3;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lstore_3Reader implements Reader<DefaultLStore_3> {

    @Override
    public DefaultLStore_3 read(final ByteCodeReader input) throws IOException {
        return DefaultLStore_3.INSTANCE;
    }
}