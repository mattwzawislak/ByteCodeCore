package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultLDiv;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ldivReader implements Reader<DefaultLDiv> {

    @Override
    public DefaultLDiv read(final ByteCodeReader input) throws IOException {
        return DefaultLDiv.INSTANCE;
    }
}