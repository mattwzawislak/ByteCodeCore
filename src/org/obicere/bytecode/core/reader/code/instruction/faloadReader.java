package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultFALoad;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class faloadReader implements Reader<DefaultFALoad> {

    @Override
    public DefaultFALoad read(final ByteCodeReader input) throws IOException {
        return DefaultFALoad.INSTANCE;
    }
}