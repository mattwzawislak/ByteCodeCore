package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.drem;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dremReader implements Reader<drem> {

    @Override
    public drem read(final ByteCodeReader input) throws IOException {
        return drem.INSTANCE;
    }
}