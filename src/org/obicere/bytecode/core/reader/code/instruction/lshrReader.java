package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultLShR;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lshrReader implements Reader<DefaultLShR> {

    @Override
    public DefaultLShR read(final ByteCodeReader input) throws IOException {
        return DefaultLShR.INSTANCE;
    }
}