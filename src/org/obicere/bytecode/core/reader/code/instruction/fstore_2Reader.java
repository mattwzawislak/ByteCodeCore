package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.FStore_2;
import org.obicere.bytecode.core.objects.code.instruction.DefaultFStore_2;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class FStore_2Reader implements Reader<FStore_2> {

    @Override
    public FStore_2 read(final ByteCodeReader input) throws IOException {
        return DefaultFStore_2.INSTANCE;
    }
}