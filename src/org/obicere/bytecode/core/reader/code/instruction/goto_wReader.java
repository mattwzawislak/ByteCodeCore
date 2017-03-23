package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.Goto_w;
import org.obicere.bytecode.core.objects.code.instruction.DefaultGoto_w;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class Goto_wReader implements Reader<Goto_w> {

    @Override
    public Goto_w read(final ByteCodeReader input) throws IOException {
        final int index = input.getIndex() - 1;
        return new DefaultGoto_w(input.readWideLabel(index));
    }
}