package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.ifnull;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ifnullReader implements Reader<ifnull> {

    @Override
    public ifnull read(final ByteCodeReader input) throws IOException {
        final int index = input.getIndex() - 1;
        return new ifnull(input.readLabel(index));
    }
}