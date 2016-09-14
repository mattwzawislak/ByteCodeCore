package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.jsr_w;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class jsr_wReader implements Reader<jsr_w> {

    @Override
    public jsr_w read(final ByteCodeReader input) throws IOException {
        final int index = input.getIndex() - 1;
        return new jsr_w(input.readWideLabel(index));
    }
}