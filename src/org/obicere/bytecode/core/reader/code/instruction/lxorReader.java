package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultLXor;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lxorReader implements Reader<DefaultLXor> {

    @Override
    public DefaultLXor read(final ByteCodeReader input) throws IOException {
        return DefaultLXor.INSTANCE;
    }
}