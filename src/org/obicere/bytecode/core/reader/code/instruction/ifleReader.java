package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.ifle;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ifleReader implements Reader<ifle> {
    @Override
    public ifle read(final ByteCodeReader input) throws IOException {
        final int index = input.getIndex() - 1;
        return new ifle(input.readLabel(index));
    }
}