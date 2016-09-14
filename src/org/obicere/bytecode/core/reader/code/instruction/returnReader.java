package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.return_;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class returnReader implements Reader<return_> {

    @Override
    public return_ read(final ByteCodeReader input) throws IOException {
        return return_.INSTANCE;
    }
}