package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.AStore_3;
import org.obicere.bytecode.core.objects.code.instruction.DefaultAStore_3;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class AStore_3Reader implements Reader<AStore_3> {

    @Override
    public AStore_3 read(final ByteCodeReader input) throws IOException {
        return DefaultAStore_3.INSTANCE;
    }
}
