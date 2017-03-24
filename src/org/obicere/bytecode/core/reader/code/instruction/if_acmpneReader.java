package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.If_ACmpNe;
import org.obicere.bytecode.core.objects.code.instruction.DefaultIf_ACmpNe;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class If_ACmpNeReader implements Reader<If_ACmpNe> {

    @Override
    public If_ACmpNe read(final ByteCodeReader input) throws IOException {
        final int index = input.getIndex() - 1;
        return new DefaultIf_ACmpNe(input.readLabel(index));
    }
}