package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.Pop;
import org.obicere.bytecode.core.objects.code.instruction.DefaultPop;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class PopReader implements Reader<Pop> {

    @Override
    public Pop read(final ByteCodeReader input) throws IOException {
        return DefaultPop.INSTANCE;
    }
}