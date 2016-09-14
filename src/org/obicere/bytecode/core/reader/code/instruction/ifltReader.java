package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.iflt;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ifltReader implements Reader<iflt> {

    @Override
    public iflt read(final ByteCodeReader input) throws IOException {
        final int index = input.getIndex() - 1;
        return new iflt(input.readLabel(index));
    }
}