package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.AStore_2;
import org.obicere.bytecode.core.objects.code.instruction.DefaultAStore_2;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class AStore_2Reader implements Reader<AStore_2> {

    @Override
    public AStore_2 read(final ByteCodeReader input) throws IOException {
        return DefaultAStore_2.INSTANCE;
    }
}
