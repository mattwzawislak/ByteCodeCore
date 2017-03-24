package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.LNeg;
import org.obicere.bytecode.core.objects.code.instruction.DefaultLNeg;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LNegReader implements Reader<LNeg> {

    @Override
    public LNeg read(final ByteCodeReader input) throws IOException {
        return DefaultLNeg.INSTANCE;
    }
}