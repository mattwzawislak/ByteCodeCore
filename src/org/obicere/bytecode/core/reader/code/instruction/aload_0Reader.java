package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.aload_0;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class aload_0Reader implements Reader<aload_0> {

    @Override
    public aload_0 read(final ByteCodeReader input) throws IOException {
        return aload_0.INSTANCE;
    }
}
