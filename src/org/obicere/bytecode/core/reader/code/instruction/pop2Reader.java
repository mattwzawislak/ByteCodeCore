package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.pop2;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class pop2Reader implements Reader<pop2> {

    @Override
    public pop2 read(final ByteCodeReader input) throws IOException {
        return pop2.INSTANCE;
    }
}