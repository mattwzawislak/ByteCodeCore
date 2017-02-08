package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultIStore_3;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class istore_3Reader implements Reader<DefaultIStore_3> {

    @Override
    public DefaultIStore_3 read(final ByteCodeReader input) throws IOException {
        return DefaultIStore_3.INSTANCE;
    }
}