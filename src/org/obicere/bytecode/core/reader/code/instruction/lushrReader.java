package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultLUShR;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lushrReader implements Reader<DefaultLUShR> {

    @Override
    public DefaultLUShR read(final ByteCodeReader input) throws IOException {
        return DefaultLUShR.INSTANCE;
    }
}