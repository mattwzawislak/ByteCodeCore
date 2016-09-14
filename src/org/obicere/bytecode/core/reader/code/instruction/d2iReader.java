package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.d2i;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class d2iReader implements Reader<d2i> {

    @Override
    public d2i read(final ByteCodeReader input) throws IOException {
        return d2i.INSTANCE;
    }
}