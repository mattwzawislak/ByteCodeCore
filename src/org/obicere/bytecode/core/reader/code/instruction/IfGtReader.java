package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.IfGt;
import org.obicere.bytecode.core.objects.code.instruction.DefaultIfGt;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class IfGtReader implements Reader<IfGt> {

    @Override
    public IfGt read(final ByteCodeReader input) throws IOException {
        final int index = input.getIndex() - 1;
        return new DefaultIfGt(input.readLabel(index));
    }
}