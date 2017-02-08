package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultFReturn;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class freturnReader implements Reader<DefaultFReturn> {

    @Override
    public DefaultFReturn read(final ByteCodeReader input) throws IOException {
        return DefaultFReturn.INSTANCE;
    }
}