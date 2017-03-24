package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.IfLe;
import org.obicere.bytecode.core.objects.code.instruction.DefaultIfLe;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class IfLeReader implements Reader<IfLe> {
    @Override
    public IfLe read(final ByteCodeReader input) throws IOException {
        final int index = input.getIndex() - 1;
        return new DefaultIfLe(input.readLabel(index));
    }
}