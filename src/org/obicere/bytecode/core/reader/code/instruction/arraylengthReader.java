package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.arraylength;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class arraylengthReader implements Reader<arraylength> {

    @Override
    public arraylength read(final ByteCodeReader input) throws IOException {
        return arraylength.INSTANCE;
    }
}
