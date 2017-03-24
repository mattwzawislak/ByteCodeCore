package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.IStore_2;
import org.obicere.bytecode.core.objects.code.instruction.DefaultIStore_2;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class IStore_2Reader implements Reader<IStore_2> {

    @Override
    public IStore_2 read(final ByteCodeReader input) throws IOException {
        return DefaultIStore_2.INSTANCE;
    }
}