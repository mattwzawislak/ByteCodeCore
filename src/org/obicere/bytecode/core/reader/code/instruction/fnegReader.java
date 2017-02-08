package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.DefaultFNeg;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fnegReader implements Reader<DefaultFNeg> {

    @Override
    public DefaultFNeg read(final ByteCodeReader input) throws IOException {
        return DefaultFNeg.INSTANCE;
    }
}