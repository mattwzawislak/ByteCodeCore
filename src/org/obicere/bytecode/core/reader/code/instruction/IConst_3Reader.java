package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.IConst_3;
import org.obicere.bytecode.core.objects.code.instruction.DefaultIConst_3;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class IConst_3Reader implements Reader<IConst_3> {

    @Override
    public IConst_3 read(final ByteCodeReader input) throws IOException {
        return DefaultIConst_3.INSTANCE;
    }
}