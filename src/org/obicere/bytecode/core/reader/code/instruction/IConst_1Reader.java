package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.IConst_1;
import org.obicere.bytecode.core.objects.code.instruction.DefaultIConst_1;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class IConst_1Reader implements Reader<IConst_1> {

    @Override
    public IConst_1 read(final ByteCodeReader input) throws IOException {
        return DefaultIConst_1.INSTANCE;
    }
}