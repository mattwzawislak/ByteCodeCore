package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.iaload;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ialoadReader implements Reader<iaload> {

    @Override
    public iaload read(final ByteCodeReader input) throws IOException {
        return iaload.INSTANCE;
    }
}