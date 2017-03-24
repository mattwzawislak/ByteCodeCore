package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.IStore_3;
import org.obicere.bytecode.core.objects.code.instruction.DefaultIStore_3;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class IStore_3Reader implements Reader<IStore_3> {

    @Override
    public IStore_3 read(final ByteCodeReader input) throws IOException {
        return DefaultIStore_3.INSTANCE;
    }
}