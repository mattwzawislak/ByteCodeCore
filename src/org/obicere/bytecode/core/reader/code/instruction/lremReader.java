package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultLRem;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lremReader implements Reader<DefaultLRem> {

    @Override
    public DefaultLRem read(final ByteCodeReader input) throws IOException {
        return DefaultLRem.INSTANCE;
    }
}