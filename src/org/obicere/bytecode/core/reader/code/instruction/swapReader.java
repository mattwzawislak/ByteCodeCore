package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.Swap;
import org.obicere.bytecode.core.objects.code.instruction.DefaultSwap;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class SwapReader implements Reader<Swap> {

    @Override
    public Swap read(final ByteCodeReader input) throws IOException {
        return DefaultSwap.INSTANCE;
    }
}