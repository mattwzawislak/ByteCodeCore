package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultAStore_0;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class astore_0Reader implements Reader<DefaultAStore_0> {

    @Override
    public DefaultAStore_0 read(final ByteCodeReader input) throws IOException {
        return DefaultAStore_0.INSTANCE;
    }
}
