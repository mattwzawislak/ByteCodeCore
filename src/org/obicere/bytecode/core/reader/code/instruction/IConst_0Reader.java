package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.IConst_0;
import org.obicere.bytecode.core.objects.code.instruction.DefaultIConst_0;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class IConst_0Reader implements Reader<IConst_0> {

    @Override
    public IConst_0 read(final ByteCodeReader input) throws IOException {
        return DefaultIConst_0.INSTANCE;
    }
}