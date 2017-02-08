package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultIConst_2;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iconst_2Reader implements Reader<DefaultIConst_2> {

    @Override
    public DefaultIConst_2 read(final ByteCodeReader input) throws IOException {
        return DefaultIConst_2.INSTANCE;
    }
}