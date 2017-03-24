package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.FConst_0;
import org.obicere.bytecode.core.objects.code.instruction.DefaultFConst_0;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class FConst_0Reader implements Reader<FConst_0> {

    @Override
    public FConst_0 read(final ByteCodeReader input) throws IOException {
        return DefaultFConst_0.INSTANCE;
    }
}