package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultPop2;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class pop2Reader implements Reader<DefaultPop2> {

    @Override
    public DefaultPop2 read(final ByteCodeReader input) throws IOException {
        return DefaultPop2.INSTANCE;
    }
}