package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.LConst_0;
import org.obicere.bytecode.core.objects.code.instruction.DefaultLConst_0;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LConst_0Reader implements Reader<LConst_0> {

    @Override
    public LConst_0 read(final ByteCodeReader input) throws IOException {
        return DefaultLConst_0.INSTANCE;
    }
}