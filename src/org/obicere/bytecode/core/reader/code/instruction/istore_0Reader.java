package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultIStore_0;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class istore_0Reader implements Reader<DefaultIStore_0> {

    @Override
    public DefaultIStore_0 read(final ByteCodeReader input) throws IOException {
        return DefaultIStore_0.INSTANCE;
    }
}