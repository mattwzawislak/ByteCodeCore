package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.l2d;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class l2dReader implements Reader<l2d> {

    @Override
    public l2d read(final ByteCodeReader input) throws IOException {
        return l2d.INSTANCE;
    }
}