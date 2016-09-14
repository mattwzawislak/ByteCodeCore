package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.dup2;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dup2Reader implements Reader<dup2> {

    @Override
    public dup2 read(final ByteCodeReader input) throws IOException {
        return dup2.INSTANCE;
    }
}