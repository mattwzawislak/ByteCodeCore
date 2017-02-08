package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultDConst_1;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dconst_1Reader implements Reader<DefaultDConst_1> {

    @Override
    public DefaultDConst_1 read(final ByteCodeReader input) throws IOException {
        return DefaultDConst_1.INSTANCE;
    }
}