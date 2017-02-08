package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultDDiv;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ddivReader implements Reader<DefaultDDiv> {

    @Override
    public DefaultDDiv read(final ByteCodeReader input) throws IOException {
        return DefaultDDiv.INSTANCE;
    }
}