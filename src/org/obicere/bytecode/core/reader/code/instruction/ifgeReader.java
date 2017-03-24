package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.IfGe;
import org.obicere.bytecode.core.objects.code.instruction.DefaultIfGe;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class IfGeReader implements Reader<IfGe> {

    @Override
    public IfGe read(final ByteCodeReader input) throws IOException {
        final int index = input.getIndex() - 1;
        return new DefaultIfGe(input.readLabel(index));
    }
}