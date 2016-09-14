package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.if_icmpne;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class if_icmpneReader implements Reader<if_icmpne> {

    @Override
    public if_icmpne read(final ByteCodeReader input) throws IOException {
        final int index = input.getIndex() - 1;
        return new if_icmpne(input.readLabel(index));
    }
}