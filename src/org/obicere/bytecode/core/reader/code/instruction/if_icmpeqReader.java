package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.if_icmpeq;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class if_icmpeqReader implements Reader<if_icmpeq> {

    @Override
    public if_icmpeq read(final ByteCodeReader input) throws IOException {
        final int index = input.getIndex() - 1;
        return new if_icmpeq(input.readLabel(index));
    }
}