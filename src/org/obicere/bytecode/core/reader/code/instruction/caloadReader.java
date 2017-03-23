package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.CALoad;
import org.obicere.bytecode.core.objects.code.instruction.DefaultCALoad;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class CALoadReader implements Reader<CALoad> {

    @Override
    public CALoad read(final ByteCodeReader input) throws IOException {
        return DefaultCALoad.INSTANCE;
    }
}
