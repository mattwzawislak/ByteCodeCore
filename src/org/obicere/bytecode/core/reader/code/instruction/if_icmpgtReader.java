package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.if_icmpgt;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class if_icmpgtReader implements Reader<if_icmpgt> {

    @Override
    public if_icmpgt read(final ByteCodeReader input) throws IOException {
        final int index = input.getIndex() - 1;
        return new if_icmpgt(input.readLabel(index));
    }
}