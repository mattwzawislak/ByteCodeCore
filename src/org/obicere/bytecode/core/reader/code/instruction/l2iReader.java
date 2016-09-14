package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.l2i;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class l2iReader implements Reader<l2i> {

    @Override
    public l2i read(final ByteCodeReader input) throws IOException {
        return l2i.INSTANCE;
    }
}