package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultFDiv;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fdivReader implements Reader<DefaultFDiv> {

    @Override
    public DefaultFDiv read(final ByteCodeReader input) throws IOException {
        return DefaultFDiv.INSTANCE;
    }
}