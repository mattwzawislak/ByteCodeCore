package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.d2l;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class d2lReader implements Reader<d2l> {

    @Override
    public d2l read(final ByteCodeReader input) throws IOException {
        return d2l.INSTANCE;
    }
}