package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.FLoad_3;
import org.obicere.bytecode.core.objects.code.instruction.DefaultFLoad_3;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class FLoad_3Reader implements Reader<FLoad_3> {

    @Override
    public FLoad_3 read(final ByteCodeReader input) throws IOException {
        return DefaultFLoad_3.INSTANCE;
    }
}