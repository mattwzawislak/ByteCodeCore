package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.LUShR;
import org.obicere.bytecode.core.objects.code.instruction.DefaultLUShR;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LUShRReader implements Reader<LUShR> {

    @Override
    public LUShR read(final ByteCodeReader input) throws IOException {
        return DefaultLUShR.INSTANCE;
    }
}