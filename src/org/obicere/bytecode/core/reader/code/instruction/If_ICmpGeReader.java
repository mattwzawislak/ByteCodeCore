package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.If_ICmpGe;
import org.obicere.bytecode.core.objects.code.instruction.DefaultIf_ICmpGe;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class If_ICmpGeReader implements Reader<If_ICmpGe> {

    @Override
    public If_ICmpGe read(final ByteCodeReader input) throws IOException {
        final int index = input.getIndex() - 1;
        return new DefaultIf_ICmpGe(input.readLabel(index));
    }
}