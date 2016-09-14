package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.goto_;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class gotoReader implements Reader<goto_> {

    @Override
    public goto_ read(final ByteCodeReader input) throws IOException {
        final int index = input.getIndex() - 1;
        return new goto_(input.readLabel(index));
    }
}