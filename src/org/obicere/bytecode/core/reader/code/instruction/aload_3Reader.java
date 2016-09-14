package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.aload_3;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class aload_3Reader implements Reader<aload_3> {

    @Override
    public aload_3 read(final ByteCodeReader input) throws IOException {
        return aload_3.INSTANCE;
    }
}