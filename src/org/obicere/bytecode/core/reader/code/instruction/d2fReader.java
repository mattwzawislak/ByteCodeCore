package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.d2f;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class d2fReader implements Reader<d2f> {

    @Override
    public d2f read(final ByteCodeReader input) throws IOException {
        return d2f.INSTANCE;
    }
}
