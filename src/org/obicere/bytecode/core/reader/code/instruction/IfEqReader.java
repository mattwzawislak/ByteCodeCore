package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.IfEq;
import org.obicere.bytecode.core.objects.code.instruction.DefaultIfEq;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class IfEqReader implements Reader<IfEq> {

    @Override
    public IfEq read(final ByteCodeReader input) throws IOException {
        final int index = input.getIndex() - 1;
        return new DefaultIfEq(input.readLabel(index));
    }
}