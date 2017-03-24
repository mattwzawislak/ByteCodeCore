package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.FLoad_1;
import org.obicere.bytecode.core.objects.code.instruction.DefaultFLoad_1;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class FLoad_1Reader implements Reader<FLoad_1> {

    @Override
    public FLoad_1 read(final ByteCodeReader input) throws IOException {
        return DefaultFLoad_1.INSTANCE;
    }
}