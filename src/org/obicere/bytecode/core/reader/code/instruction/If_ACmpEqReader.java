package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.If_ACmpEq;
import org.obicere.bytecode.core.objects.code.instruction.DefaultIf_ACmpEq;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class If_ACmpEqReader implements Reader<If_ACmpEq> {

    @Override
    public If_ACmpEq read(final ByteCodeReader input) throws IOException {
        final int index = input.getIndex() - 1;
        return new DefaultIf_ACmpEq(input.readLabel(index));
    }
}