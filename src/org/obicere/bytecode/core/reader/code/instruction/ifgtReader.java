package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.ifgt;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ifgtReader implements Reader<ifgt> {

    @Override
    public ifgt read(final ByteCodeReader input) throws IOException {
        final int index = input.getIndex() - 1;
        return new ifgt(input.readLabel(index));
    }
}