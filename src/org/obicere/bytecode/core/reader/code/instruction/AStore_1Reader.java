package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.AStore_1;
import org.obicere.bytecode.core.objects.code.instruction.DefaultAStore_1;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class AStore_1Reader implements Reader<AStore_1> {

    @Override
    public AStore_1 read(final ByteCodeReader input) throws IOException {
        return DefaultAStore_1.INSTANCE;
    }
}
