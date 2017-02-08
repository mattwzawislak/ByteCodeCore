package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultIDiv;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class idivReader implements Reader<DefaultIDiv> {

    @Override
    public DefaultIDiv read(final ByteCodeReader input) throws IOException {
        return DefaultIDiv.INSTANCE;
    }
}