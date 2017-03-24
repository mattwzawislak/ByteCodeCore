package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.SIPush;
import org.obicere.bytecode.core.objects.code.instruction.DefaultSIPush;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class SIPushReader implements Reader<SIPush> {

    @Override
    public SIPush read(final ByteCodeReader input) throws IOException {
        return new DefaultSIPush(input.readShort());
    }
}