package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultSIPush;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class sipushReader implements Reader<DefaultSIPush> {

    @Override
    public DefaultSIPush read(final ByteCodeReader input) throws IOException {
        return new DefaultSIPush(input.readShort());
    }
}