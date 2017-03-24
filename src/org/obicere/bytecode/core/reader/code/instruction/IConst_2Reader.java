package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.IConst_2;
import org.obicere.bytecode.core.objects.code.instruction.DefaultIConst_2;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class IConst_2Reader implements Reader<IConst_2> {

    @Override
    public IConst_2 read(final ByteCodeReader input) throws IOException {
        return DefaultIConst_2.INSTANCE;
    }
}