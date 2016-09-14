package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.frem;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fremReader implements Reader<frem> {

    @Override
    public frem read(final ByteCodeReader input) throws IOException {
        return frem.INSTANCE;
    }
}