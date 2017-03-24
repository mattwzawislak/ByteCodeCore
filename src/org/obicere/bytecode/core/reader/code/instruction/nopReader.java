package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.Nop;
import org.obicere.bytecode.core.objects.code.instruction.DefaultNop;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class NopReader implements Reader<Nop> {

    @Override
    public Nop read(final ByteCodeReader input) throws IOException {
        return DefaultNop.INSTANCE;
    }
}