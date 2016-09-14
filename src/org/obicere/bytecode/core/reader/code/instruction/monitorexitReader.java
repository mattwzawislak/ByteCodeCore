package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.monitorexit;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class monitorexitReader implements Reader<monitorexit> {

    @Override
    public monitorexit read(final ByteCodeReader input) throws IOException {
        return monitorexit.INSTANCE;
    }
}