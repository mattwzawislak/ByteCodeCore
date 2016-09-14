package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.pop;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class popReader implements Reader<pop> {

    @Override
    public pop read(final ByteCodeReader input) throws IOException {
        return pop.INSTANCE;
    }
}