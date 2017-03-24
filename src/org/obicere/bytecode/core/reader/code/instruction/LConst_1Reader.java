package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.LConst_1;
import org.obicere.bytecode.core.objects.code.instruction.DefaultLConst_1;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class LConst_1Reader implements Reader<LConst_1> {

    @Override
    public LConst_1 read(final ByteCodeReader input) throws IOException {
        return DefaultLConst_1.INSTANCE;
    }
}