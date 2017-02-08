package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultDNeg;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class dnegReader implements Reader<DefaultDNeg> {

    @Override
    public DefaultDNeg read(final ByteCodeReader input) throws IOException {
        return DefaultDNeg.INSTANCE;
    }
}