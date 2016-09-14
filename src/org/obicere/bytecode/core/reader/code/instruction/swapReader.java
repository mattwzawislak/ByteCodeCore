package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.swap;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class swapReader implements Reader<swap> {

    @Override
    public swap read(final ByteCodeReader input) throws IOException {
        return swap.INSTANCE;
    }
}