package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.goto_w;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class goto_wReader implements Reader<goto_w> {

    @Override
    public goto_w read(final ByteCodeReader input) throws IOException {
        final int index = input.getIndex() - 1;
        return new goto_w(input.readWideLabel(index));
    }
}