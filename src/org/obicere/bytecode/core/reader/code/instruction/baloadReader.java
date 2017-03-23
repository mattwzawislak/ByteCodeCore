package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.BALoad;
import org.obicere.bytecode.core.objects.code.instruction.DefaultBALoad;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class BALoadReader implements Reader<BALoad> {

    @Override
    public BALoad read(final ByteCodeReader input) throws IOException {
        return DefaultBALoad.INSTANCE;
    }
}
