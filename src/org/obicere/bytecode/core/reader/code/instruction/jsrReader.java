package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.jsr;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class jsrReader implements Reader<jsr> {

    @Override
    public jsr read(final ByteCodeReader input) throws IOException {
        final int index = input.getIndex() - 1;
        return new jsr(input.readLabel(index));
    }
}