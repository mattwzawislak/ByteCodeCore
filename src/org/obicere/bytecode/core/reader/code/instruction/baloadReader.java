package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultBALoad;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class baloadReader implements Reader<DefaultBALoad> {

    @Override
    public DefaultBALoad read(final ByteCodeReader input) throws IOException {
        return DefaultBALoad.INSTANCE;
    }
}
