package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultLConst_0;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lconst_0Reader implements Reader<DefaultLConst_0> {

    @Override
    public DefaultLConst_0 read(final ByteCodeReader input) throws IOException {
        return DefaultLConst_0.INSTANCE;
    }
}