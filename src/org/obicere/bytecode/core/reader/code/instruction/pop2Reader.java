package org.obicere.bytecode.core.reader.code.instruction;

import org.javacore.code.instruction.Pop2;
import org.obicere.bytecode.core.objects.code.instruction.DefaultPop2;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class Pop2Reader implements Reader<Pop2> {

    @Override
    public Pop2 read(final ByteCodeReader input) throws IOException {
        return DefaultPop2.INSTANCE;
    }
}