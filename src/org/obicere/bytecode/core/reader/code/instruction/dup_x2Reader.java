package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.dup_x2;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dup_x2Reader implements Reader<dup_x2> {

    @Override
    public dup_x2 read(final ByteCodeReader input) throws IOException {
        return dup_x2.INSTANCE;
    }
}