package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultLReturn;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lreturnReader implements Reader<DefaultLReturn> {

    @Override
    public DefaultLReturn read(final ByteCodeReader input) throws IOException {
        return DefaultLReturn.INSTANCE;
    }
}