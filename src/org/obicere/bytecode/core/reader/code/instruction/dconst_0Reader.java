package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultDConst_0;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dconst_0Reader implements Reader<DefaultDConst_0> {

    @Override
    public DefaultDConst_0 read(final ByteCodeReader input) throws IOException {
        return DefaultDConst_0.INSTANCE;
    }
}