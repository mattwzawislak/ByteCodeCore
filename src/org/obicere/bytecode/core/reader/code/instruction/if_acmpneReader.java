package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.if_acmpne;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class if_acmpneReader implements Reader<if_acmpne> {

    @Override
    public if_acmpne read(final ByteCodeReader input) throws IOException {
        final int index = input.getIndex() - 1;
        return new if_acmpne(input.readLabel(index));
    }
}