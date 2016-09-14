package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.fneg;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fnegReader implements Reader<fneg> {

    @Override
    public fneg read(final ByteCodeReader input) throws IOException {
        return fneg.INSTANCE;
    }
}