package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.IfNull;
import org.obicere.bytecode.core.objects.code.instruction.DefaultIfNull;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class IfNullReader implements Reader<IfNull> {

    @Override
    public IfNull read(final ByteCodeReader input) throws IOException {
        final int index = input.getIndex() - 1;
        return new DefaultIfNull(input.readLabel(index));
    }
}