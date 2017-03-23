package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.Dup;
import org.obicere.bytecode.core.objects.code.instruction.DefaultDup;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class DupReader implements Reader<Dup> {

    @Override
    public Dup read(final ByteCodeReader input) throws IOException {
        return DefaultDup.INSTANCE;
    }
}