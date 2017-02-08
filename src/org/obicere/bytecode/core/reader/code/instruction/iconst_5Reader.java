package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultIConst_5;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iconst_5Reader implements Reader<DefaultIConst_5> {

    @Override
    public DefaultIConst_5 read(final ByteCodeReader input) throws IOException {
        return DefaultIConst_5.INSTANCE;
    }
}