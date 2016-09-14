package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.aaload;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class aaloadReader implements Reader<aaload> {

    @Override
    public aaload read(final ByteCodeReader input) throws IOException {
        return aaload.INSTANCE;
    }
}
