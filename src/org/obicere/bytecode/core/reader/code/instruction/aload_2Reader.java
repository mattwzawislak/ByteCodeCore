package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.aload_2;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class aload_2Reader implements Reader<aload_2> {

    @Override
    public aload_2 read(final ByteCodeReader input) throws IOException {
        return aload_2.INSTANCE;
    }
}