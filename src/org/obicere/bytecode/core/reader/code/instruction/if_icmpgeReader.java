package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.if_icmpge;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class if_icmpgeReader implements Reader<if_icmpge> {

    @Override
    public if_icmpge read(final ByteCodeReader input) throws IOException {
        final int index = input.getIndex() - 1;
        return new if_icmpge(input.readLabel(index));
    }
}