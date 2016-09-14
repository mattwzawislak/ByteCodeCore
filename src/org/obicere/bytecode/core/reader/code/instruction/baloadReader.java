package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.baload;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class baloadReader implements Reader<baload> {

    @Override
    public baload read(final ByteCodeReader input) throws IOException {
        return baload.INSTANCE;
    }
}
