package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.IfNonNull;
import org.obicere.bytecode.core.objects.code.instruction.DefaultIfNonNull;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class IfNonNullReader implements Reader<IfNonNull> {

    @Override
    public IfNonNull read(final ByteCodeReader input) throws IOException {
        final int index = input.getIndex() - 1;
        return new DefaultIfNonNull(input.readLabel(index));
    }
}