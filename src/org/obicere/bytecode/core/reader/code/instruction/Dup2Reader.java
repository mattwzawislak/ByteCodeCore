package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.Dup2;
import org.obicere.bytecode.core.objects.code.instruction.DefaultDup2;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class Dup2Reader implements Reader<Dup2> {

    @Override
    public Dup2 read(final ByteCodeReader input) throws IOException {
        return DefaultDup2.INSTANCE;
    }
}