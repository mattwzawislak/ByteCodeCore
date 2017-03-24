package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.AStore_0;
import org.obicere.bytecode.core.objects.code.instruction.DefaultAStore_0;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class AStore_0Reader implements Reader<AStore_0> {

    @Override
    public AStore_0 read(final ByteCodeReader input) throws IOException {
        return DefaultAStore_0.INSTANCE;
    }
}
