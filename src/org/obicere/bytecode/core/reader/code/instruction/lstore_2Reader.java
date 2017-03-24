package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.LStore_2;
import org.obicere.bytecode.core.objects.code.instruction.DefaultLStore_2;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LStore_2Reader implements Reader<LStore_2> {

    @Override
    public LStore_2 read(final ByteCodeReader input) throws IOException {
        return DefaultLStore_2.INSTANCE;
    }
}