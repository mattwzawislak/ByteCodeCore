package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.faload;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class faloadReader implements Reader<faload> {

    @Override
    public faload read(final ByteCodeReader input) throws IOException {
        return faload.INSTANCE;
    }
}