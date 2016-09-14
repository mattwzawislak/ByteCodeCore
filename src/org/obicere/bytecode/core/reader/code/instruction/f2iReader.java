package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.f2i;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class f2iReader implements Reader<f2i> {

    @Override
    public f2i read(final ByteCodeReader input) throws IOException {
        return f2i.INSTANCE;
    }
}