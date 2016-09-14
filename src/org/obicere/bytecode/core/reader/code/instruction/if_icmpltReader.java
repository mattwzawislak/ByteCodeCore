package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.if_icmplt;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class if_icmpltReader implements Reader<if_icmplt> {

    @Override
    public if_icmplt read(final ByteCodeReader input) throws IOException {
        final int index = input.getIndex() - 1;
        return new if_icmplt(input.readLabel(index));
    }
}