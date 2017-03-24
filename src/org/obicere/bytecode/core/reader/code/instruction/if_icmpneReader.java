package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.If_ICmpNe;
import org.obicere.bytecode.core.objects.code.instruction.DefaultIf_ICmpNe;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class If_ICmpNeReader implements Reader<If_ICmpNe> {

    @Override
    public If_ICmpNe read(final ByteCodeReader input) throws IOException {
        final int index = input.getIndex() - 1;
        return new DefaultIf_ICmpNe(input.readLabel(index));
    }
}