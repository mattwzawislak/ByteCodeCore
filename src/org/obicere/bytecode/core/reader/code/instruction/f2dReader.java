package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.f2d;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class f2dReader implements Reader<f2d> {

    @Override
    public f2d read(final ByteCodeReader input) throws IOException {
        return f2d.INSTANCE;
    }
}