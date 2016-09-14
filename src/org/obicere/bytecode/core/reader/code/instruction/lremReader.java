package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.lrem;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lremReader implements Reader<lrem> {

    @Override
    public lrem read(final ByteCodeReader input) throws IOException {
        return lrem.INSTANCE;
    }
}