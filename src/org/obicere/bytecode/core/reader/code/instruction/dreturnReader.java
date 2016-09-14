package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.dreturn;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dreturnReader implements Reader<dreturn> {

    @Override
    public dreturn read(final ByteCodeReader input) throws IOException {
        return dreturn.INSTANCE;
    }
}