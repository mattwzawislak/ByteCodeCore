package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.lreturn;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lreturnReader implements Reader<lreturn> {

    @Override
    public lreturn read(final ByteCodeReader input) throws IOException {
        return lreturn.INSTANCE;
    }
}