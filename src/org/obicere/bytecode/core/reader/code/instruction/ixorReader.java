package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.ixor;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class ixorReader implements Reader<ixor> {

    @Override
    public ixor read(final ByteCodeReader input) throws IOException {
        return ixor.INSTANCE;
    }
}