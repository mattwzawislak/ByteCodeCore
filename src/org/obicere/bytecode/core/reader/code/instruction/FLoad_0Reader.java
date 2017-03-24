package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.FLoad_0;
import org.obicere.bytecode.core.objects.code.instruction.DefaultFLoad_0;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class FLoad_0Reader implements Reader<FLoad_0> {

    @Override
    public FLoad_0 read(final ByteCodeReader input) throws IOException {
        return DefaultFLoad_0.INSTANCE;
    }
}