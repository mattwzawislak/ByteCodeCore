package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.if_acmpeq;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class if_acmpeqReader implements Reader<if_acmpeq> {

    @Override
    public if_acmpeq read(final ByteCodeReader input) throws IOException {
        final int index = input.getIndex() - 1;
        return new if_acmpeq(input.readLabel(index));
    }
}