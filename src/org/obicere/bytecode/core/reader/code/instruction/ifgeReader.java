package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.ifge;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ifgeReader implements Reader<ifge> {

    @Override
    public ifge read(final ByteCodeReader input) throws IOException {
        final int index = input.getIndex() - 1;
        return new ifge(input.readLabel(index));
    }
}