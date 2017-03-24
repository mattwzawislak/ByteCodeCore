package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.LXor;
import org.obicere.bytecode.core.objects.code.instruction.DefaultLXor;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LXorReader implements Reader<LXor> {

    @Override
    public LXor read(final ByteCodeReader input) throws IOException {
        return DefaultLXor.INSTANCE;
    }
}