package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultISub;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class isubReader implements Reader<DefaultISub> {

    @Override
    public DefaultISub read(final ByteCodeReader input) throws IOException {
        return DefaultISub.INSTANCE;
    }
}