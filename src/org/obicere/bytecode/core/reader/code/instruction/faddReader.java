package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.fadd;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class faddReader implements Reader<fadd> {

    @Override
    public fadd read(final ByteCodeReader input) throws IOException {
        return fadd.INSTANCE;
    }
}