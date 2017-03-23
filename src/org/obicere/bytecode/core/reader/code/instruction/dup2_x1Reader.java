package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.Dup2_x1;
import org.obicere.bytecode.core.objects.code.instruction.DefaultDup2_x1;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class Dup2_x1Reader implements Reader<Dup2_x1> {

    @Override
    public Dup2_x1 read(final ByteCodeReader input) throws IOException {
        return DefaultDup2_x1.INSTANCE;
    }
}