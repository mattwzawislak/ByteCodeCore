package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultDALoad;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class daloadReader implements Reader<DefaultDALoad> {

    @Override
    public DefaultDALoad read(final ByteCodeReader input) throws IOException {
        return DefaultDALoad.INSTANCE;
    }
}