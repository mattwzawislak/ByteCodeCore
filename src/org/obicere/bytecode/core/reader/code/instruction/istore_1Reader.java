package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultIStore_1;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class istore_1Reader implements Reader<DefaultIStore_1> {

    @Override
    public DefaultIStore_1 read(final ByteCodeReader input) throws IOException {
        return DefaultIStore_1.INSTANCE;
    }
}