package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.aconst_null;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class aconst_nullReader implements Reader<aconst_null> {

    @Override
    public aconst_null read(final ByteCodeReader input) throws IOException {
        return aconst_null.INSTANCE;
    }
}
