package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.LStore_1;
import org.obicere.bytecode.core.objects.code.instruction.DefaultLStore_1;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LStore_1Reader implements Reader<LStore_1> {

    @Override
    public LStore_1 read(final ByteCodeReader input) throws IOException {
        return DefaultLStore_1.INSTANCE;
    }
}