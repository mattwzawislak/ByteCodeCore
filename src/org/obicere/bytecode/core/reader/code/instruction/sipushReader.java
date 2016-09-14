package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.sipush;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class sipushReader implements Reader<sipush> {

    @Override
    public sipush read(final ByteCodeReader input) throws IOException {
        return new sipush(input.readShort());
    }
}