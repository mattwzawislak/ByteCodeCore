package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.LShL;
import org.obicere.bytecode.core.objects.code.instruction.DefaultLShL;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LShLReader implements Reader<LShL> {

    @Override
    public LShL read(final ByteCodeReader input) throws IOException {
        return DefaultLShL.INSTANCE;
    }
}