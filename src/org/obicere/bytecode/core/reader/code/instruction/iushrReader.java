package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.iushr;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class iushrReader implements Reader<iushr> {

    @Override
    public iushr read(final ByteCodeReader input) throws IOException {
        return iushr.INSTANCE;
    }
}