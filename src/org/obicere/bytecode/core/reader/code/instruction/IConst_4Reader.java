package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.IConst_4;
import org.obicere.bytecode.core.objects.code.instruction.DefaultIConst_4;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class IConst_4Reader implements Reader<IConst_4> {

    @Override
    public IConst_4 read(final ByteCodeReader input) throws IOException {
        return DefaultIConst_4.INSTANCE;
    }
}