package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultDSub;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dsubReader implements Reader<DefaultDSub> {

    @Override
    public DefaultDSub read(final ByteCodeReader input) throws IOException {
        return DefaultDSub.INSTANCE;
    }
}