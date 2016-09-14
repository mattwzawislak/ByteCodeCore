package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.fsub;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fsubReader implements Reader<fsub> {

    @Override
    public fsub read(final ByteCodeReader input) throws IOException {
        return fsub.INSTANCE;
    }
}