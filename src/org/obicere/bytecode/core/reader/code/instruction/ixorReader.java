package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultIXor;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ixorReader implements Reader<DefaultIXor> {

    @Override
    public DefaultIXor read(final ByteCodeReader input) throws IOException {
        return DefaultIXor.INSTANCE;
    }
}