package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.LStore_0;
import org.obicere.bytecode.core.objects.code.instruction.DefaultLStore_0;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LStore_0Reader implements Reader<LStore_0> {

    @Override
    public LStore_0 read(final ByteCodeReader input) throws IOException {
        return DefaultLStore_0.INSTANCE;
    }
}