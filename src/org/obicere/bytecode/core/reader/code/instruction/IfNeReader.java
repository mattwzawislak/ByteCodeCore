package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.IfNe;
import org.obicere.bytecode.core.objects.code.instruction.DefaultIfNe;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class IfNeReader implements Reader<IfNe> {

    @Override
    public IfNe read(final ByteCodeReader input) throws IOException {
        final int index = input.getIndex() - 1;
        return new DefaultIfNe(input.readLabel(index));
    }
}