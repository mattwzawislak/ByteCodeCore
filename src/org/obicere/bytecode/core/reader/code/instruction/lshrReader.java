package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.LShR;
import org.obicere.bytecode.core.objects.code.instruction.DefaultLShR;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LShRReader implements Reader<LShR> {

    @Override
    public LShR read(final ByteCodeReader input) throws IOException {
        return DefaultLShR.INSTANCE;
    }
}