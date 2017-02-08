package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultReturn;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class returnReader implements Reader<DefaultReturn> {

    @Override
    public DefaultReturn read(final ByteCodeReader input) throws IOException {
        return DefaultReturn.INSTANCE;
    }
}