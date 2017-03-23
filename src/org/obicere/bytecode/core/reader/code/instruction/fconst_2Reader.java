package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.FConst_2;
import org.obicere.bytecode.core.objects.code.instruction.DefaultFConst_2;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class FConst_2Reader implements Reader<FConst_2> {

    @Override
    public FConst_2 read(final ByteCodeReader input) throws IOException {
        return DefaultFConst_2.INSTANCE;
    }
}