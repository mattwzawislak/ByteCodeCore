package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultLSub;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lsubReader implements Reader<DefaultLSub> {

    @Override
    public DefaultLSub read(final ByteCodeReader input) throws IOException {
        return DefaultLSub.INSTANCE;
    }
}