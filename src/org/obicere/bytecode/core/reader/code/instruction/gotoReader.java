package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultGoto;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class gotoReader implements Reader<DefaultGoto> {

    @Override
    public DefaultGoto read(final ByteCodeReader input) throws IOException {
        final int index = input.getIndex() - 1;
        return new DefaultGoto(input.readLabel(index));
    }
}