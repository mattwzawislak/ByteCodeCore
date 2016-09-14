package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.ireturn;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ireturnReader implements Reader<ireturn> {

    @Override
    public ireturn read(final ByteCodeReader input) throws IOException {
        return ireturn.INSTANCE;
    }
}