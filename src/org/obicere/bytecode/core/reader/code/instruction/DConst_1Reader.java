package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.DConst_1;
import org.obicere.bytecode.core.objects.code.instruction.DefaultDConst_1;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class DConst_1Reader implements Reader<DConst_1> {

    @Override
    public DConst_1 read(final ByteCodeReader input) throws IOException {
        return DefaultDConst_1.INSTANCE;
    }
}