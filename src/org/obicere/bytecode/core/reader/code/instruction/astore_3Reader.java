package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultAStore_3;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class astore_3Reader implements Reader<DefaultAStore_3> {

    @Override
    public DefaultAStore_3 read(final ByteCodeReader input) throws IOException {
        return DefaultAStore_3.INSTANCE;
    }
}
