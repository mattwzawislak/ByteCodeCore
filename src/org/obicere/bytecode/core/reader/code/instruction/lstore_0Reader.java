package org.obicere.bytecode.core.reader.code.instruction;

import org.obicere.bytecode.core.objects.code.instruction.lstore_0;
import org.obicere.bytecode.core.reader.Reader;
import org.obicere.bytecode.core.util.ByteCodeReader;

import java.io.IOException;

/**
 * @author Obicere
 */
public class lstore_0Reader implements Reader<lstore_0> {

    @Override
    public lstore_0 read(final ByteCodeReader input) throws IOException {
        return lstore_0.INSTANCE;
    }
}