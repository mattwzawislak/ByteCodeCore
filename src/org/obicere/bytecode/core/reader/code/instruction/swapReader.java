package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultSwap;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class swapReader implements Reader<DefaultSwap> {

    @Override
    public DefaultSwap read(final ByteCodeReader input) throws IOException {
        return DefaultSwap.INSTANCE;
    }
}