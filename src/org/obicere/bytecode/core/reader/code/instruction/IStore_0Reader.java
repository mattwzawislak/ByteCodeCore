package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.IStore_0;
import org.obicere.bytecode.core.objects.code.instruction.DefaultIStore_0;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class IStore_0Reader implements Reader<IStore_0> {

    @Override
    public IStore_0 read(final ByteCodeReader input) throws IOException {
        return DefaultIStore_0.INSTANCE;
    }
}