package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.If_ICmpEq;
import org.obicere.bytecode.core.objects.code.instruction.DefaultIf_ICmpEq;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class If_ICmpEqReader implements Reader<If_ICmpEq> {

    @Override
    public If_ICmpEq read(final ByteCodeReader input) throws IOException {
        final int index = input.getIndex() - 1;
        return new DefaultIf_ICmpEq(input.readLabel(index));
    }
}