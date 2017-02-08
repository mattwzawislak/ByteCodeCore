package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultDup2;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dup2Reader implements Reader<DefaultDup2> {

    @Override
    public DefaultDup2 read(final ByteCodeReader input) throws IOException {
        return DefaultDup2.INSTANCE;
    }
}