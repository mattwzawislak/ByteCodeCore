package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultAStore_2;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class astore_2Reader implements Reader<DefaultAStore_2> {

    @Override
    public DefaultAStore_2 read(final ByteCodeReader input) throws IOException {
        return DefaultAStore_2.INSTANCE;
    }
}
