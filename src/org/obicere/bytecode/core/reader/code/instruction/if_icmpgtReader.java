package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.If_ICmpGt;
import org.obicere.bytecode.core.objects.code.instruction.DefaultIf_ICmpGt;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class If_ICmpGtReader implements Reader<If_ICmpGt> {

    @Override
    public If_ICmpGt read(final ByteCodeReader input) throws IOException {
        final int index = input.getIndex() - 1;
        return new DefaultIf_ICmpGt(input.readLabel(index));
    }
}