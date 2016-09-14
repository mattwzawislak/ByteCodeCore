package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.nop;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class nopReader implements Reader<nop> {

    @Override
    public nop read(final ByteCodeReader input) throws IOException {
        return nop.INSTANCE;
    }
}