package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultIConst_4;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iconst_4Reader implements Reader<DefaultIConst_4> {

    @Override
    public DefaultIConst_4 read(final ByteCodeReader input) throws IOException {
        return DefaultIConst_4.INSTANCE;
    }
}