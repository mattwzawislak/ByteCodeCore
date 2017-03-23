package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.IConst_m1;
import org.obicere.bytecode.core.objects.code.instruction.DefaultIConst_m1;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class IConst_m1Reader implements Reader<IConst_m1> {

    @Override
    public IConst_m1 read(final ByteCodeReader input) throws IOException {
        return DefaultIConst_m1.INSTANCE;
    }
}