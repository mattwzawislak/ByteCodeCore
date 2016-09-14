package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.fmul;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class fmulReader implements Reader<fmul> {

    @Override
    public fmul read(final ByteCodeReader input) throws IOException {
        return fmul.INSTANCE;
    }
}