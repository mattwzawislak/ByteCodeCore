package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.LStore_3;
import org.obicere.bytecode.core.objects.code.instruction.DefaultLStore_3;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LStore_3Reader implements Reader<LStore_3> {

    @Override
    public LStore_3 read(final ByteCodeReader input) throws IOException {
        return DefaultLStore_3.INSTANCE;
    }
}