package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.If_ICmpLt;
import org.obicere.bytecode.core.objects.code.instruction.DefaultIf_ICmpLt;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class If_ICmpLtReader implements Reader<If_ICmpLt> {

    @Override
    public If_ICmpLt read(final ByteCodeReader input) throws IOException {
        final int index = input.getIndex() - 1;
        return new DefaultIf_ICmpLt(input.readLabel(index));
    }
}