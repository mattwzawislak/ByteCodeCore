package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.FNeg;
import org.obicere.bytecode.core.objects.code.instruction.DefaultFNeg;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class FNegReader implements Reader<FNeg> {

    @Override
    public FNeg read(final ByteCodeReader input) throws IOException {
        return DefaultFNeg.INSTANCE;
    }
}