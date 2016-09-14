package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.f2l;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class f2lReader implements Reader<f2l> {

    @Override
    public f2l read(final ByteCodeReader input) throws IOException {
        return f2l.INSTANCE;
    }
}