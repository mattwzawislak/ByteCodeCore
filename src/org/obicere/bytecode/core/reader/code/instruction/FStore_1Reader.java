package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.FStore_1;
import org.obicere.bytecode.core.objects.code.instruction.DefaultFStore_1;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class FStore_1Reader implements Reader<FStore_1> {

    @Override
    public FStore_1 read(final ByteCodeReader input) throws IOException {
        return DefaultFStore_1.INSTANCE;
    }
}