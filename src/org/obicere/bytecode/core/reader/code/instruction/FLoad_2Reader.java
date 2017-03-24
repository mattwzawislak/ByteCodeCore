package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.FLoad_2;
import org.obicere.bytecode.core.objects.code.instruction.DefaultFLoad_2;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class FLoad_2Reader implements Reader<FLoad_2> {

    @Override
    public FLoad_2 read(final ByteCodeReader input) throws IOException {
        return DefaultFLoad_2.INSTANCE;
    }
}