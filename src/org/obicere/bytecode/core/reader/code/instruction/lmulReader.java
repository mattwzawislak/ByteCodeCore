package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.lmul;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lmulReader implements Reader<lmul> {

    @Override
    public lmul read(final ByteCodeReader input) throws IOException {
        return lmul.INSTANCE;
    }
}