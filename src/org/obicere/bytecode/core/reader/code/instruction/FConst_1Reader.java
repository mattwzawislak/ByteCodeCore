package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.FConst_1;
import org.obicere.bytecode.core.objects.code.instruction.DefaultFConst_1;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class FConst_1Reader implements Reader<FConst_1> {

    @Override
    public FConst_1 read(final ByteCodeReader input) throws IOException {
        return DefaultFConst_1.INSTANCE;
    }
}