package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultIConst_3;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iconst_3Reader implements Reader<DefaultIConst_3> {

    @Override
    public DefaultIConst_3 read(final ByteCodeReader input) throws IOException {
        return DefaultIConst_3.INSTANCE;
    }
}