package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultPop;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class popReader implements Reader<DefaultPop> {

    @Override
    public DefaultPop read(final ByteCodeReader input) throws IOException {
        return DefaultPop.INSTANCE;
    }
}