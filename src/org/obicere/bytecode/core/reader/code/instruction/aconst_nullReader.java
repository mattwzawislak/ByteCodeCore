package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultAConst_Null;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class aconst_nullReader implements Reader<DefaultAConst_Null> {

    @Override
    public DefaultAConst_Null read(final ByteCodeReader input) throws IOException {
        return DefaultAConst_Null.INSTANCE;
    }
}
