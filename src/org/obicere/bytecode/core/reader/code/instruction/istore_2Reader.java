package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultIStore_2;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class istore_2Reader implements Reader<DefaultIStore_2> {

    @Override
    public DefaultIStore_2 read(final ByteCodeReader input) throws IOException {
        return DefaultIStore_2.INSTANCE;
    }
}