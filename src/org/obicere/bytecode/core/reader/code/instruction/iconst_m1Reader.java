package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultIConst_m1;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iconst_m1Reader implements Reader<DefaultIConst_m1> {

    @Override
    public DefaultIConst_m1 read(final ByteCodeReader input) throws IOException {
        return DefaultIConst_m1.INSTANCE;
    }
}