package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultFConst_0;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fconst_0Reader implements Reader<DefaultFConst_0> {

    @Override
    public DefaultFConst_0 read(final ByteCodeReader input) throws IOException {
        return DefaultFConst_0.INSTANCE;
    }
}