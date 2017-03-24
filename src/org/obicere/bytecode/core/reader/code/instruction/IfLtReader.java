package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.IfLt;
import org.obicere.bytecode.core.objects.code.instruction.DefaultIfLt;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class IfLtReader implements Reader<IfLt> {

    @Override
    public IfLt read(final ByteCodeReader input) throws IOException {
        final int index = input.getIndex() - 1;
        return new DefaultIfLt(input.readLabel(index));
    }
}