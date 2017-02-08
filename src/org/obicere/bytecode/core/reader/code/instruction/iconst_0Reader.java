package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultIConst_0;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iconst_0Reader implements Reader<DefaultIConst_0> {

    @Override
    public DefaultIConst_0 read(final ByteCodeReader input) throws IOException {
        return DefaultIConst_0.INSTANCE;
    }
}