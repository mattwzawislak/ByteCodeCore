package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultAReturn;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class areturnReader implements Reader<DefaultAReturn> {

    @Override
    public DefaultAReturn read(final ByteCodeReader input) throws IOException {
        return DefaultAReturn.INSTANCE;
    }
}
