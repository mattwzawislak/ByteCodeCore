package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.FStore_3;
import org.obicere.bytecode.core.objects.code.instruction.DefaultFStore_3;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class FStore_3Reader implements Reader<FStore_3> {

    @Override
    public FStore_3 read(final ByteCodeReader input) throws IOException {
        return DefaultFStore_3.INSTANCE;
    }
}