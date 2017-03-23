package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.DConst_0;
import org.obicere.bytecode.core.objects.code.instruction.DefaultDConst_0;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class DConst_0Reader implements Reader<DConst_0> {

    @Override
    public DConst_0 read(final ByteCodeReader input) throws IOException {
        return DefaultDConst_0.INSTANCE;
    }
}