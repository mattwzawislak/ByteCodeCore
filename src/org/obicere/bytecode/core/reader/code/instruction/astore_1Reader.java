package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultAStore_1;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class astore_1Reader implements Reader<DefaultAStore_1> {

    @Override
    public DefaultAStore_1 read(final ByteCodeReader input) throws IOException {
        return DefaultAStore_1.INSTANCE;
    }
}
