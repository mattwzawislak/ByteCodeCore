package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.ifne;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ifneReader implements Reader<ifne> {

    @Override
    public ifne read(final ByteCodeReader input) throws IOException {
        final int index = input.getIndex() - 1;
        return new ifne(input.readLabel(index));
    }
}