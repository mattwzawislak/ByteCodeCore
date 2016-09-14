package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.aload_1;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class aload_1Reader implements Reader<aload_1> {

    @Override
    public aload_1 read(final ByteCodeReader input) throws IOException {
        return aload_1.INSTANCE;
    }
}