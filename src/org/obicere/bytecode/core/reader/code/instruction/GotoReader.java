package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.Goto;
import org.obicere.bytecode.core.objects.code.instruction.DefaultGoto;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class GotoReader implements Reader<Goto> {

    @Override
    public Goto read(final ByteCodeReader input) throws IOException {
        final int index = input.getIndex() - 1;
        return new DefaultGoto(input.readLabel(index));
    }
}