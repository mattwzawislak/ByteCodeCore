package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.athrow;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class athrowReader implements Reader<athrow> {

    @Override
    public athrow read(final ByteCodeReader input) throws IOException {
        return athrow.INSTANCE;
    }
}
