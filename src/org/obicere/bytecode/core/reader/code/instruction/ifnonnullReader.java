package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.ifnonnull;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ifnonnullReader implements Reader<ifnonnull> {

    @Override
    public ifnonnull read(final ByteCodeReader input) throws IOException {
        final int index = input.getIndex() - 1;
        return new ifnonnull(input.readLabel(index));
    }
}